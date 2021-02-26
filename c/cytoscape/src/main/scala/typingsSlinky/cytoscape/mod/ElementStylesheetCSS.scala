package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementStylesheetCSS extends StylesheetCSS {
  
  def json(): js.Any = js.native
}
object ElementStylesheetCSS {
  
  @scala.inline
  def apply(css: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core, json: () => js.Any, selector: String): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
  
  @scala.inline
  implicit class ElementStylesheetCSSMutableBuilder[Self <: ElementStylesheetCSS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJson(value: () => js.Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
  }
}
