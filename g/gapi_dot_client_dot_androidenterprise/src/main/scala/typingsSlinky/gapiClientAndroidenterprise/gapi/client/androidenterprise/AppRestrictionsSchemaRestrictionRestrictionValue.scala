package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchemaRestrictionRestrictionValue extends js.Object {
  /** The type of the value being provided. */
  var `type`: js.UndefOr[String] = js.native
  /** The boolean value - this will only be present if type is bool. */
  var valueBool: js.UndefOr[Boolean] = js.native
  /** The integer value - this will only be present if type is integer. */
  var valueInteger: js.UndefOr[Double] = js.native
  /** The list of string values - this will only be present if type is multiselect. */
  var valueMultiselect: js.UndefOr[js.Array[String]] = js.native
  /** The string value - this will be present for types string, choice and hidden. */
  var valueString: js.UndefOr[String] = js.native
}

object AppRestrictionsSchemaRestrictionRestrictionValue {
  @scala.inline
  def apply(): AppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaRestrictionRestrictionValue]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaRestrictionRestrictionValueOps[Self <: AppRestrictionsSchemaRestrictionRestrictionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withValueBool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBool")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInteger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMultiselect(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMultiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMultiselect")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
  }
  
}

