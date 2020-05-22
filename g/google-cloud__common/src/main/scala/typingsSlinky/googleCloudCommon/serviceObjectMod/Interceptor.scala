package typingsSlinky.googleCloudCommon.serviceObjectMod

import typingsSlinky.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsSlinky.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def request(opts: Options): DecorateRequestOptions
}

object Interceptor {
  @scala.inline
  def apply(request: Options => DecorateRequestOptions): Interceptor = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[Interceptor]
  }
}

