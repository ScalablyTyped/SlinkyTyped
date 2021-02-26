package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#cy.style
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.StylesheetStyle
  - typingsSlinky.cytoscape.mod.StylesheetCSS
*/
trait Stylesheet extends StObject
object Stylesheet {
  
  @scala.inline
  def StylesheetCSS(css: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core, selector: String): typingsSlinky.cytoscape.mod.StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cytoscape.mod.StylesheetCSS]
  }
  
  @scala.inline
  def StylesheetStyle(selector: String, style: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core): typingsSlinky.cytoscape.mod.StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cytoscape.mod.StylesheetStyle]
  }
}
