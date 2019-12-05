package typingsSlinky.cytoscape.cytoscapeMod

import typingsSlinky.cytoscape.cytoscapeMod.Css.Edge
import typingsSlinky.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementStylesheetCSS extends StylesheetCSS {
  def json(): js.Any
}

object ElementStylesheetCSS {
  @scala.inline
  def apply(
    css: Node | Edge | typingsSlinky.cytoscape.cytoscapeMod.Css.Core,
    json: () => js.Any,
    selector: String
  ): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
}

