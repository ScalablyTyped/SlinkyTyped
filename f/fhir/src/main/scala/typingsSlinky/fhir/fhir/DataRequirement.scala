package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a required data item
  */
@js.native
trait DataRequirement extends Element {
  /**
    * Contains extended information for property 'mustSupport'.
    */
  var _mustSupport: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * What codes are expected
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.native
  /**
    * What dates/date ranges are expected
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.native
  /**
    * Indicates that specific structure elements are referenced by the knowledge module
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.native
  /**
    * The profile of the required data
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  /**
    * The type of the required data
    */
  var `type`: code = js.native
}

object DataRequirement {
  @scala.inline
  def apply(`type`: code): DataRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirement]
  }
  @scala.inline
  implicit class DataRequirementOps[Self <: DataRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_mustSupport(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mustSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_mustSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mustSupport")(js.undefined)
        ret
    }
    @scala.inline
    def with_profile(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeFilter(value: js.Array[DataRequirementCodeFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFilter(value: js.Array[DataRequirementDateFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMustSupport(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
  }
  
}

