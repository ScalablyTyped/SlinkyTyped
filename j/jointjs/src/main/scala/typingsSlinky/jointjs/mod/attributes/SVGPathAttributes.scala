package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathAttributes extends SVGAttributes {
  var d: js.UndefOr[String] = js.native
  var `path-length`: js.UndefOr[Double] = js.native
  var pathLength: js.UndefOr[Double] = js.native
}

object SVGPathAttributes {
  @scala.inline
  def apply(): SVGPathAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathAttributes]
  }
  @scala.inline
  implicit class SVGPathAttributesOps[Self <: SVGPathAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def `withPath-length`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPath-length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path-length")(js.undefined)
        ret
    }
    @scala.inline
    def withPathLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLength")(js.undefined)
        ret
    }
  }
  
}

