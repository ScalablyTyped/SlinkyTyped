package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a location entry.
  */
@js.native
trait SchemaUserLocation extends js.Object {
  /**
    * Textual location. This is most useful for display purposes to concisely
    * describe the location. For example, &quot;Mountain View, CA&quot;,
    * &quot;Near Seattle&quot;, &quot;US-NYC-9TH 9A209A&quot;.
    */
  var area: js.UndefOr[String] = js.native
  /**
    * Building Identifier.
    */
  var buildingId: js.UndefOr[String] = js.native
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Most specific textual code of individual desk location.
    */
  var deskCode: js.UndefOr[String] = js.native
  /**
    * Floor name/number.
    */
  var floorName: js.UndefOr[String] = js.native
  /**
    * Floor section. More specific location within the floor. For example, if a
    * floor is divided into sections &quot;A&quot;, &quot;B&quot;, and
    * &quot;C&quot;, this field would identify one of those values.
    */
  var floorSection: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example location could be of types default and desk. In addition to
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have &quot;custom&quot; as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserLocation {
  @scala.inline
  def apply(): SchemaUserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLocation]
  }
  @scala.inline
  implicit class SchemaUserLocationOps[Self <: SchemaUserLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeskCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deskCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeskCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deskCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
  }
  
}

