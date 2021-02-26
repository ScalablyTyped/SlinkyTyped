package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.Bottom
import typingsSlinky.atom.atomStrings.Left
import typingsSlinky.atom.atomStrings.Right
import typingsSlinky.atom.atomStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends StObject {
  
  var newValue: Top | Right | Bottom | Left = js.native
  
  var oldValue: js.UndefOr[Top | Right | Bottom | Left] = js.native
}
object `13` {
  
  @scala.inline
  def apply(newValue: Top | Right | Bottom | Left): `13` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
