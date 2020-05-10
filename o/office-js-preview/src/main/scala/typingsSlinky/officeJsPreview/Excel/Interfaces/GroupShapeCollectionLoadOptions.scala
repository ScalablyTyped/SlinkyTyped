package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the shape collection inside a shape group.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait GroupShapeCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the number of connection sites on this shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectionSiteCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the geometric shape associated with the shape. An error will be thrown if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShape: js.UndefOr[GeometricShapeLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the shape group associated with the shape. An error will be thrown if the shape type is not "GroupShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var group: js.UndefOr[ShapeGroupLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the image associated with the shape. An error will be thrown if the shape type is not "Image".
    *
    * [Api set: ExcelApi 1.9]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the line associated with the shape. An error will be thrown if the shape type is not "Line".
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[LineLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the line formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether or not the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the parent group of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentGroup: js.UndefOr[ShapeLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the text frame object of this shape. Read only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textFrame: js.UndefOr[TextFrameLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the type of this shape. See Excel.ShapeType for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the visibility of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[Boolean] = js.native
}

object GroupShapeCollectionLoadOptions {
  @scala.inline
  def apply(): GroupShapeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupShapeCollectionLoadOptions]
  }
  @scala.inline
  implicit class GroupShapeCollectionLoadOptionsOps[Self <: GroupShapeCollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTextDescription(value: Boolean): Self = {
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
    def withAltTextTitle(value: Boolean): Self = {
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
    def withConnectionSiteCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSiteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionSiteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSiteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ShapeFillLoadOptions): Self = {
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
    def withGeometricShape(value: GeometricShapeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometricShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricShape")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometricShapeType(value: Boolean): Self = {
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
    def withGroup(value: ShapeGroupLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Boolean): Self = {
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
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: ImageLoadOptions): Self = {
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
    @scala.inline
    def withLeft(value: Boolean): Self = {
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
    def withLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: LineLoadOptions): Self = {
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
    def withLineFormat(value: ShapeLineFormatLoadOptions): Self = {
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
    def withName(value: Boolean): Self = {
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
    def withParentGroup(value: ShapeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Boolean): Self = {
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
    def withRotation(value: Boolean): Self = {
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
    def withTextFrame(value: TextFrameLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Boolean): Self = {
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
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    def withWidth(value: Boolean): Self = {
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
    @scala.inline
    def withZOrderPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrderPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOrderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrderPosition")(js.undefined)
        ret
    }
  }
  
}

