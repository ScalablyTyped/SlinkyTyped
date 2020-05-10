package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default [10, 10]
    */
  var step: js.UndefOr[Point] = js.native
}

object GraticuleProps {
  @scala.inline
  def apply(): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleProps]
  }
  @scala.inline
  implicit class GraticulePropsOps[Self <: GraticuleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

