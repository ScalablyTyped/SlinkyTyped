package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.BitmapMode
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all properties of a bitmap when used as FillStyle.
  * @see com.sun.star.drawing.FillProperties
  */
@js.native
trait FillBitmap extends js.Object {
  /**
    * this enum selects how a area is filled with a single bitmap.
    *
    * It may be repeated, stretched or displayed with blank space around it.
    */
  var aBitmapMode: BitmapMode = js.native
  /**
    * This is the horizontal and vertical offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var aOffset: Point = js.native
  /** Every second line (X) / row (Y) of tiles is moved the given percent of the width of the bitmap. */
  var aPositionOffset: Point = js.native
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var aRectanglePoint: RectanglePoint = js.native
  /**
    * This is the size of the tile for filling.
    *
    * Depending on the property LogicalSize, this is either relative or absolute.
    */
  var aSize: Size = js.native
  /** a URL to the bitmap used. This may be an internal URL of the graphics manager. */
  var aURL: String = js.native
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties SizeX and SizeY contain the size of the tile in percent of the size of the original bitmap. If this is `FALSE` ,
    * the size of the tile is specified with 1/100th mm.
    */
  var bLogicalSize: Boolean = js.native
}

object FillBitmap {
  @scala.inline
  def apply(
    aBitmapMode: BitmapMode,
    aOffset: Point,
    aPositionOffset: Point,
    aRectanglePoint: RectanglePoint,
    aSize: Size,
    aURL: String,
    bLogicalSize: Boolean
  ): FillBitmap = {
    val __obj = js.Dynamic.literal(aBitmapMode = aBitmapMode.asInstanceOf[js.Any], aOffset = aOffset.asInstanceOf[js.Any], aPositionOffset = aPositionOffset.asInstanceOf[js.Any], aRectanglePoint = aRectanglePoint.asInstanceOf[js.Any], aSize = aSize.asInstanceOf[js.Any], aURL = aURL.asInstanceOf[js.Any], bLogicalSize = bLogicalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillBitmap]
  }
  @scala.inline
  implicit class FillBitmapOps[Self <: FillBitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABitmapMode(value: BitmapMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aBitmapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPositionOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aPositionOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARectanglePoint(value: RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aRectanglePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withASize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLogicalSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bLogicalSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

