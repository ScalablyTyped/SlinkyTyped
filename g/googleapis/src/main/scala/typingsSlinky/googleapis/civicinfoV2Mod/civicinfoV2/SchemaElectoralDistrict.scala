package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the geographic scope of a contest.
  */
@js.native
trait SchemaElectoralDistrict extends js.Object {
  /**
    * An identifier for this district, relative to its scope. For example, the
    * 34th State Senate district would have id &quot;34&quot; and a scope of
    * stateUpper.
    */
  var id: js.UndefOr[String] = js.native
  var kgForeignKey: js.UndefOr[String] = js.native
  /**
    * The name of the district.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The geographic scope of this district. If unspecified the district&#39;s
    * geography is not known. One of: national, statewide, congressional,
    * stateUpper, stateLower, countywide, judicial, schoolBoard, cityWide,
    * township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.native
}

object SchemaElectoralDistrict {
  @scala.inline
  def apply(): SchemaElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectoralDistrict]
  }
  @scala.inline
  implicit class SchemaElectoralDistrictOps[Self <: SchemaElectoralDistrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
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
    def withKgForeignKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kgForeignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKgForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kgForeignKey")(js.undefined)
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
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

