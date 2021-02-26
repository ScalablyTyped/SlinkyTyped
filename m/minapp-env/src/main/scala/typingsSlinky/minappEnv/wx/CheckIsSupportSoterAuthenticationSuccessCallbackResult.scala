package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.facial
import typingsSlinky.minappEnv.minappEnvStrings.fingerPrint
import typingsSlinky.minappEnv.minappEnvStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSupportSoterAuthenticationSuccessCallbackResult extends StObject {
  
  /** 该设备支持的可被SOTER识别的生物识别方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var supportMode: Array[fingerPrint | facial | speech] = js.native
}
object CheckIsSupportSoterAuthenticationSuccessCallbackResult {
  
  @scala.inline
  def apply(supportMode: Array[fingerPrint | facial | speech]): CheckIsSupportSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationSuccessCallbackResultMutableBuilder[Self <: CheckIsSupportSoterAuthenticationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportMode(value: Array[fingerPrint | facial | speech]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
  }
}
