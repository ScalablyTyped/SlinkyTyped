package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class StylesheetStyleOps[Self <: StylesheetStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Node | Edge | typingsSlinky.cytoscape.mod.Css.Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

