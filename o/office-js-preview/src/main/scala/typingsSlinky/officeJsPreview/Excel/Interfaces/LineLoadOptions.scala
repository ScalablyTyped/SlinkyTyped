package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a line inside a worksheet. To get the corresponding Shape object, use `Line.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait LineLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the shape to which the beginning of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedShape: js.UndefOr[ShapeLoadOptions] = js.native
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the shape to which the end of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedShape: js.UndefOr[ShapeLoadOptions] = js.native
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the Shape object associated with the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.native
}

object LineLoadOptions {
  @scala.inline
  def apply(): LineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLoadOptions]
  }
  @scala.inline
  implicit class LineLoadOptionsOps[Self <: LineLoadOptions] (val x: Self) extends AnyVal {
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
    def withBeginArrowheadLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadLength")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginArrowheadStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginArrowheadWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginConnectedShape(value: ShapeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginConnectedShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginConnectedShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginConnectedShape")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginConnectedSite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginConnectedSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginConnectedSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginConnectedSite")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorType")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadLength")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEndConnectedShape(value: ShapeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnectedShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndConnectedShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnectedShape")(js.undefined)
        ret
    }
    @scala.inline
    def withEndConnectedSite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnectedSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndConnectedSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnectedSite")(js.undefined)
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
    def withIsBeginConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeginConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBeginConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeginConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEndConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEndConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: ShapeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
  }
  
}

