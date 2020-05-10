package typingsSlinky.phosphorDomutils.elementMod.ElementExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the border and padding data for an element.
  */
@js.native
trait IBoxSizing extends js.Object {
  /**
    * The bottom border width, in pixels.
    */
  var borderBottom: Double = js.native
  /**
    * The left border width, in pixels.
    */
  var borderLeft: Double = js.native
  /**
    * The right border width, in pixels.
    */
  var borderRight: Double = js.native
  /**
    * The top border width, in pixels.
    */
  var borderTop: Double = js.native
  /**
    * The sum of horizontal border and padding.
    */
  var horizontalSum: Double = js.native
  /**
    * The bottom padding width, in pixels.
    */
  var paddingBottom: Double = js.native
  /**
    * The left padding width, in pixels.
    */
  var paddingLeft: Double = js.native
  /**
    * The right padding width, in pixels.
    */
  var paddingRight: Double = js.native
  /**
    * The top padding width, in pixels.
    */
  var paddingTop: Double = js.native
  /**
    * The sum of vertical border and padding.
    */
  var verticalSum: Double = js.native
}

object IBoxSizing {
  @scala.inline
  def apply(
    borderBottom: Double,
    borderLeft: Double,
    borderRight: Double,
    borderTop: Double,
    horizontalSum: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double,
    verticalSum: Double
  ): IBoxSizing = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any], horizontalSum = horizontalSum.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], verticalSum = verticalSum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoxSizing]
  }
  @scala.inline
  implicit class IBoxSizingOps[Self <: IBoxSizing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

