package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppStrings.`4000`
import typingsSlinky.aliApp.aliAppStrings.`6001`
import typingsSlinky.aliApp.aliAppStrings.`6002`
import typingsSlinky.aliApp.aliAppStrings.`9000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultStatus extends StObject {
  
  var result: Admitstate = js.native
  
  /**
    * 6001    用户取消了业务流程
    * 6002    网络异常
    * 9000    成功
    * 4000    系统异常
    */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String = js.native
}
object ResultStatus {
  
  @scala.inline
  def apply(result: Admitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): ResultStatus = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStatus]
  }
  
  @scala.inline
  implicit class ResultStatusMutableBuilder[Self <: ResultStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Admitstate): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultStatus(value: `6001` | `6002` | `9000` | `4000` | String): Self = StObject.set(x, "resultStatus", value.asInstanceOf[js.Any])
  }
}
