package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleLinkSelectors extends js.Object {
  var line: js.UndefOr[SVGPathAttributes] = js.native
  var outline: js.UndefOr[SVGPathAttributes] = js.native
  var root: js.UndefOr[SVGAttributes] = js.native
}

object DoubleLinkSelectors {
  @scala.inline
  def apply(): DoubleLinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleLinkSelectors]
  }
  @scala.inline
  implicit class DoubleLinkSelectorsOps[Self <: DoubleLinkSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

