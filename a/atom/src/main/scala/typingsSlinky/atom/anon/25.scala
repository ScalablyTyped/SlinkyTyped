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
trait `25` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: Top | Right | Bottom | Left = js.native
}
object `25` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: Top | Right | Bottom | Left): `25` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
