package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextAttributes extends SVGAttributes {
  var dx: js.UndefOr[String | Double] = js.native
  var dy: js.UndefOr[String | Double] = js.native
  var `length-adjust`: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[String] = js.native
  @JSName("text-anchor")
  var `text-anchor_SVGTextAttributes`: js.UndefOr[String] = js.native
  var `text-lenght`: js.UndefOr[Double] = js.native
  @JSName("textAnchor")
  var textAnchor_SVGTextAttributes: js.UndefOr[String] = js.native
  var textLength: js.UndefOr[Double] = js.native
  var x: js.UndefOr[String | Double] = js.native
  var y: js.UndefOr[String | Double] = js.native
}

object SVGTextAttributes {
  @scala.inline
  def apply(): SVGTextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTextAttributes]
  }
  @scala.inline
  implicit class SVGTextAttributesOps[Self <: SVGTextAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDx(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
    @scala.inline
    def `withLength-adjust`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length-adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLength-adjust`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length-adjust")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthAdjust(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-anchor`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-lenght`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-lenght")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-lenght`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-lenght")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLength")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

