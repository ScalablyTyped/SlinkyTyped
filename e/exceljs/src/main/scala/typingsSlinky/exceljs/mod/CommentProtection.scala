package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.False
import typingsSlinky.exceljs.exceljsStrings.True
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentProtection extends StObject {
  
  var lockText: True | False = js.native
  
  var locked: True | False = js.native
}
object CommentProtection {
  
  @scala.inline
  def apply(lockText: True | False, locked: True | False): CommentProtection = {
    val __obj = js.Dynamic.literal(lockText = lockText.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProtection]
  }
  
  @scala.inline
  implicit class CommentProtectionMutableBuilder[Self <: CommentProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockText(value: True | False): Self = StObject.set(x, "lockText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: True | False): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
