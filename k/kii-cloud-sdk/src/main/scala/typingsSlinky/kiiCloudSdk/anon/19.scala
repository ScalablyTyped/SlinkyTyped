package typingsSlinky.kiiCloudSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(): js.Any = js.native
}
object `19` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: () => js.Any): `19` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: () => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
  }
}
