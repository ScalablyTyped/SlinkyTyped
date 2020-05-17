package typingsSlinky.jointjs.mod.shapes.basic

import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.shapes.SVGRectSelector
import typingsSlinky.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBlockSelectors
  extends SVGTextSelector
     with SVGRectSelector {
  @JSName(".content")
  var Dotcontent: js.UndefOr[SVGTextAttributes] = js.native
}

object TextBlockSelectors {
  @scala.inline
  def apply(): TextBlockSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBlockSelectors]
  }
  @scala.inline
  implicit class TextBlockSelectorsOps[Self <: TextBlockSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotcontent(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotcontent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".content")(js.undefined)
        ret
    }
  }
  
}

