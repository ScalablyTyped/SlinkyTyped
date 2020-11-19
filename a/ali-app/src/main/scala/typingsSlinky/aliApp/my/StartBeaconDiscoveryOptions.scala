package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region iBeacon https://docs.alipay.com/mini/api/yqleyc
@js.native
trait StartBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
  
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: js.Array[String] = js.native
}
object StartBeaconDiscoveryOptions {
  
  @scala.inline
  def apply(uuids: js.Array[String]): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
  
  @scala.inline
  implicit class StartBeaconDiscoveryOptionsOps[Self <: StartBeaconDiscoveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = this.set("uuids", js.Array(value :_*))
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = this.set("uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
