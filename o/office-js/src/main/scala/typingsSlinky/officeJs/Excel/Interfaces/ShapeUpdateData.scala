package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.Placement
import typingsSlinky.officeJs.officeJsStrings.Absolute
import typingsSlinky.officeJs.officeJsStrings.OneCell
import typingsSlinky.officeJs.officeJsStrings.TwoCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Shape object, for use in `shape.set({ ... })`. */
@js.native
trait ShapeUpdateData extends js.Object {
  /**
    *
    * Returns or sets the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[String] = js.native
  /**
    *
    * Returns or sets the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[String] = js.native
  /**
    *
    * Returns the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillUpdateData] = js.native
  /**
    *
    * Represents the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179 */ js.Any
  ] = js.native
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Returns the line formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatUpdateData] = js.native
  /**
    *
    * Specifies whether or not the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Placement | TwoCell | OneCell | Absolute] = js.native
  /**
    *
    * Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    *
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the visibility of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.native
}

object ShapeUpdateData {
  @scala.inline
  def apply(): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeUpdateData]
  }
  @scala.inline
  implicit class ShapeUpdateDataOps[Self <: ShapeUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltTextDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTextDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTextTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTextTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTextTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ShapeFillUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometricShapeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricShapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometricShapeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricShapeType")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLineFormat(value: ShapeLineFormatUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement | TwoCell | OneCell | Absolute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

