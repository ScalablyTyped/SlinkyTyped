package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.atom
import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.poll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var newValue: native | experimental | poll | atom = js.native
  
  var oldValue: js.UndefOr[native | experimental | poll | atom] = js.native
}
object `3` {
  
  @scala.inline
  def apply(newValue: native | experimental | poll | atom): `3` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: native | experimental | poll | atom): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: native | experimental | poll | atom): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
