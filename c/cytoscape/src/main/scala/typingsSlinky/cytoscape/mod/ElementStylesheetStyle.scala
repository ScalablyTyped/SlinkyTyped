package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
@js.native
trait ElementStylesheetStyle extends StylesheetStyle {
  def json(): js.Any = js.native
}

object ElementStylesheetStyle {
  @scala.inline
  def apply(json: () => js.Any, selector: String, style: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
  @scala.inline
  implicit class ElementStylesheetStyleOps[Self <: ElementStylesheetStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJson(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

