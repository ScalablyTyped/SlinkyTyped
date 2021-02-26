package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(group: KiiGroup): js.Any = js.native
}
object `3` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiGroup => js.Any): `3` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiGroup => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
