package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a complete StyleSettings object. The primary key is a
  * combination of the tableId and a styleId.
  */
@js.native
trait SchemaStyleSetting extends js.Object {
  /**
    * Type name: an individual style setting. A StyleSetting contains the style
    * defintions for points, lines, and polygons in a table. Since a table can
    * have any one or all of them, a style definition can have point, line and
    * polygon style definitions.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Style definition for points in the table.
    */
  var markerOptions: js.UndefOr[SchemaPointStyle] = js.native
  /**
    * Optional name for the style setting.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Style definition for polygons in the table.
    */
  var polygonOptions: js.UndefOr[SchemaPolygonStyle] = js.native
  /**
    * Style definition for lines in the table.
    */
  var polylineOptions: js.UndefOr[SchemaLineStyle] = js.native
  /**
    * Identifier for the style setting (unique only within tables).
    */
  var styleId: js.UndefOr[Double] = js.native
  /**
    * Identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
}

object SchemaStyleSetting {
  @scala.inline
  def apply(): SchemaStyleSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleSetting]
  }
  @scala.inline
  implicit class SchemaStyleSettingOps[Self <: SchemaStyleSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOptions(value: SchemaPointStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
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
    def withPolygonOptions(value: SchemaPolygonStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineOptions(value: SchemaLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
  }
  
}

