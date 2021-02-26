package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBeaconsSuccess extends StObject {
  
  var beacons: js.Array[Beacon] = js.native
  
  /**
    * errorCode=0 ,接口调用成功
    */
  var errCode: String = js.native
  
  /**
    * ok
    */
  var errMsg: String = js.native
}
object GetBeaconsSuccess {
  
  @scala.inline
  def apply(beacons: js.Array[Beacon], errCode: String, errMsg: String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
  
  @scala.inline
  implicit class GetBeaconsSuccessMutableBuilder[Self <: GetBeaconsSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    @scala.inline
    def setErrCode(value: String): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
