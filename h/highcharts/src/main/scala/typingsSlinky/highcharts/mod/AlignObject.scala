package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignObject extends js.Object {
  /**
    * Horizontal alignment. Can be one of `left`, `center` and `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * Use the `transform` attribute with translateX and translateY custom
    * attributes to align this elements rather than `x` and `y` attributes.
    */
  var alignByTranslate: js.UndefOr[Boolean] = js.native
  /**
    * Vertical alignment. Can be one of `top`, `middle` and `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * Horizontal pixel offset from alignment.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Vertical pixel offset from alignment.
    */
  var y: js.UndefOr[Double] = js.native
}

object AlignObject {
  @scala.inline
  def apply(): AlignObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignObject]
  }
  @scala.inline
  implicit class AlignObjectOps[Self <: AlignObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignByTranslate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignByTranslate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignByTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignByTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
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
    def withY(value: Double): Self = {
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

