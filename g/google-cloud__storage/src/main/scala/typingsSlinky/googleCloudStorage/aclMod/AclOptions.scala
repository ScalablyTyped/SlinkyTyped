package typingsSlinky.googleCloudStorage.aclMod

import typingsSlinky.googleCloudCommon.utilMod.BodyResponseCallback
import typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclOptions extends js.Object {
  var pathPrefix: String = js.native
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
}

object AclOptions {
  @scala.inline
  def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Unit): AclOptions = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], request = js.Any.fromFunction2(request))
    __obj.asInstanceOf[AclOptions]
  }
  @scala.inline
  implicit class AclOptionsOps[Self <: AclOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

