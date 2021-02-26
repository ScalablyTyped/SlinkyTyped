package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesheetStyle extends Stylesheet {
  
  var selector: String = js.native
  
  var style: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core = js.native
}
object StylesheetStyle {
  
  @scala.inline
  def apply(selector: String, style: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetStyle]
  }
  
  @scala.inline
  implicit class StylesheetStyleMutableBuilder[Self <: StylesheetStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
