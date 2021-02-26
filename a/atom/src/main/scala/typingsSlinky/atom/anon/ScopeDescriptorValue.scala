package typingsSlinky.atom.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: StringDictionary[js.Array[String]] = js.native
}
object ScopeDescriptorValue {
  
  @scala.inline
  def apply(scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor, value: StringDictionary[js.Array[String]]): ScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorValue]
  }
  
  @scala.inline
  implicit class ScopeDescriptorValueMutableBuilder[Self <: ScopeDescriptorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
