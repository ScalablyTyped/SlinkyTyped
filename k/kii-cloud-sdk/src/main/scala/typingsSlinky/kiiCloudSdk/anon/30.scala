package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiTopic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `30` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(topic: KiiTopic): js.Any = js.native
}
object `30` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiTopic => js.Any): `30` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiTopic => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
