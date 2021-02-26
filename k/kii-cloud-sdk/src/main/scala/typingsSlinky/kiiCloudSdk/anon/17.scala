package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiMqttInstallationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(response: KiiMqttInstallationResponse): js.Any = js.native
}
object `17` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiMqttInstallationResponse => js.Any): `17` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiMqttInstallationResponse => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
