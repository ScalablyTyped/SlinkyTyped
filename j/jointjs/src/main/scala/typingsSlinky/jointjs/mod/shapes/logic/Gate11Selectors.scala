package typingsSlinky.jointjs.mod.shapes.logic

import typingsSlinky.jointjs.mod.attributes.SVGCircleAttributes
import typingsSlinky.jointjs.mod.attributes.SVGImageAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gate11Selectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGImageAttributes] = js.native
  @JSName(".input")
  var Dotinput: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".output")
  var Dotoutput: js.UndefOr[SVGCircleAttributes] = js.native
  var image: js.UndefOr[SVGImageAttributes] = js.native
}

object Gate11Selectors {
  @scala.inline
  def apply(): Gate11Selectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gate11Selectors]
  }
  @scala.inline
  implicit class Gate11SelectorsOps[Self <: Gate11Selectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotbody(value: SVGImageAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".body")(js.undefined)
        ret
    }
    @scala.inline
    def withDotinput(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotinput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".input")(js.undefined)
        ret
    }
    @scala.inline
    def withDotoutput(value: SVGCircleAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotoutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".output")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SVGImageAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
  }
  
}

