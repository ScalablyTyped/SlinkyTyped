package typingsSlinky.rcFieldForm.anon

import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mismatch extends StObject {
  
  var mismatch: js.UndefOr[ValidateMessage] = js.native
}
object Mismatch {
  
  @scala.inline
  def apply(): Mismatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mismatch]
  }
  
  @scala.inline
  implicit class MismatchMutableBuilder[Self <: Mismatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMismatch(value: ValidateMessage): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMismatchFunction0(value: () => String): Self = StObject.set(x, "mismatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMismatchUndefined: Self = StObject.set(x, "mismatch", js.undefined)
  }
}
