package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLocalServiceResolveFailCallbackResult extends js.Object {
  /** 服务的名称 */
  var serviceName: String = js.native
  /** 服务的类型 */
  var serviceType: String = js.native
}

object OnLocalServiceResolveFailCallbackResult {
  @scala.inline
  def apply(serviceName: String, serviceType: String): OnLocalServiceResolveFailCallbackResult = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLocalServiceResolveFailCallbackResult]
  }
  @scala.inline
  implicit class OnLocalServiceResolveFailCallbackResultOps[Self <: OnLocalServiceResolveFailCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

