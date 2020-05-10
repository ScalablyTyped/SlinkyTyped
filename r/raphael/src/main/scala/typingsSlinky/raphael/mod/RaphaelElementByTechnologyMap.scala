package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: Element */] extends js.Object {
  var SVG: TSvg = js.native
  var VML: TVml = js.native
}

object RaphaelElementByTechnologyMap {
  @scala.inline
  def apply[TSvg, TVml](SVG: TSvg, VML: TVml): RaphaelElementByTechnologyMap[TSvg, TVml] = {
    val __obj = js.Dynamic.literal(SVG = SVG.asInstanceOf[js.Any], VML = VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementByTechnologyMap[TSvg, TVml]]
  }
  @scala.inline
  implicit class RaphaelElementByTechnologyMapOps[Self[tsvg, tvml] <: RaphaelElementByTechnologyMap[tsvg, tvml], TSvg, TVml] (val x: Self[TSvg, TVml]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSvg, TVml] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSvg, TVml]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSvg, TVml]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSvg, TVml]) with Other]
    @scala.inline
    def withSVG(value: TSvg): Self[TSvg, TVml] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVML(value: TVml): Self[TSvg, TVml] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

