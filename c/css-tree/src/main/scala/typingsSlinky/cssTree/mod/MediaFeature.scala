package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFeature
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String = js.native
  
  @JSName("type")
  var type_MediaFeature: typingsSlinky.cssTree.cssTreeStrings.MediaFeature = js.native
  
  var value: Identifier | NumberNode | Dimension | Ratio | Null = js.native
}
object MediaFeature {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.MediaFeature): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFeature]
  }
  
  @scala.inline
  implicit class MediaFeatureMutableBuilder[Self <: MediaFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.MediaFeature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Identifier | NumberNode | Dimension | Ratio): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
