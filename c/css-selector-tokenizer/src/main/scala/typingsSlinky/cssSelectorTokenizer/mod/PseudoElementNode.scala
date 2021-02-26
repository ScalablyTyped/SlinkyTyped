package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementNode
  extends SelectorNodeType
     with BaseNode {
  
  @JSName("name")
  var name_PseudoElementNode: String = js.native
  
  var `type`: `pseudo-element` = js.native
}
object PseudoElementNode {
  
  @scala.inline
  def apply(name: String, `type`: `pseudo-element`): PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementNode]
  }
  
  @scala.inline
  implicit class PseudoElementNodeMutableBuilder[Self <: PseudoElementNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `pseudo-element`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
