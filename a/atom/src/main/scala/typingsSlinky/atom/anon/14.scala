package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.limited
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.undecided
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `14` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: limited | no | undecided = js.native
}
object `14` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: limited | no | undecided): `14` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: limited | no | undecided): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
