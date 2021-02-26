package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(response: KiiMqttEndpoint): js.Any = js.native
}
object `18` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiMqttEndpoint => js.Any): `18` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiMqttEndpoint => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
