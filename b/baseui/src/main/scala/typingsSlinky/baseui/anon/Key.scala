package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var expanded: js.Array[typingsSlinky.react.mod.Key] = js.native
  
  var key: typingsSlinky.react.mod.Key = js.native
}
object Key {
  
  @scala.inline
  def apply(expanded: js.Array[typingsSlinky.react.mod.Key], key: typingsSlinky.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: js.Array[typingsSlinky.react.mod.Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedVarargs(value: typingsSlinky.react.mod.Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
