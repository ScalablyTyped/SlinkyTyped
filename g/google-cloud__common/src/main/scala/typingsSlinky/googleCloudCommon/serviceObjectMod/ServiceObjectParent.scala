package typingsSlinky.googleCloudCommon.serviceObjectMod

import typingsSlinky.googleCloudCommon.utilMod.BodyResponseCallback
import typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.teenyRequest.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceObjectParent extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  def requestStream(reqOpts: DecorateRequestOptions): Request = js.native
}

object ServiceObjectParent {
  @scala.inline
  def apply(
    request: (DecorateRequestOptions, BodyResponseCallback) => Unit,
    requestStream: DecorateRequestOptions => Request
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction2(request), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[ServiceObjectParent]
  }
  @scala.inline
  implicit class ServiceObjectParentOps[Self <: ServiceObjectParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequestStream(value: DecorateRequestOptions => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
  }
  
}

