package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.auto
import typingsSlinky.atom.atomStrings.hard
import typingsSlinky.atom.atomStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: auto | soft | hard = js.native
}
object `19` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: auto | soft | hard): `19` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: auto | soft | hard): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
