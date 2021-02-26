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
trait `15` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: native | experimental | poll | atom = js.native
}
object `15` {
  
  @scala.inline
  def apply(
    scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor,
    value: native | experimental | poll | atom
  ): `15` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: native | experimental | poll | atom): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
