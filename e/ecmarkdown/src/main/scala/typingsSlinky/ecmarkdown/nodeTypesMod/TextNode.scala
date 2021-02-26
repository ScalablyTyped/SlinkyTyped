package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNode
  extends FragmentNode
     with Node {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: text = js.native
}
object TextNode {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: text): TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
