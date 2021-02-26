package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderscoreNode
  extends FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode] = js.native
  
  var location: LocationRange = js.native
  
  var name: underscore = js.native
}
object UnderscoreNode {
  
  @scala.inline
  def apply(contents: js.Array[FragmentNode], location: LocationRange, name: underscore): UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderscoreNode]
  }
  
  @scala.inline
  implicit class UnderscoreNodeMutableBuilder[Self <: UnderscoreNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: underscore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
