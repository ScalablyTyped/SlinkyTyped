package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.Numbersigntext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeTextNode extends DefaultTreeChildNode {
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: Numbersigntext = js.native
  
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
  
  /**
    * Text content.
    */
  var value: String = js.native
}
object DefaultTreeTextNode {
  
  @scala.inline
  def apply(nodeName: Numbersigntext, parentNode: DefaultTreeParentNode, value: String): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
  
  @scala.inline
  implicit class DefaultTreeTextNodeMutableBuilder[Self <: DefaultTreeTextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeName(value: Numbersigntext): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
