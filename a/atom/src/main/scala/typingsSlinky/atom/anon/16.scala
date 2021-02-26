package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.default
import typingsSlinky.atom.atomStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: default | srgb = js.native
}
object `16` {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: default | srgb): `16` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: default | srgb): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
