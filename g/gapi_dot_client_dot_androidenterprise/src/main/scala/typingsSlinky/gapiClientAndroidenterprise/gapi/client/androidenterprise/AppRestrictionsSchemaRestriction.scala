package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchemaRestriction extends js.Object {
  /** The default value of the restriction. bundle and bundleArray restrictions never have a default value. */
  var defaultValue: js.UndefOr[AppRestrictionsSchemaRestrictionRestrictionValue] = js.native
  /** A longer description of the restriction, giving more detail of what it affects. */
  var description: js.UndefOr[String] = js.native
  /** For choice or multiselect restrictions, the list of possible entries' human-readable names. */
  var entry: js.UndefOr[js.Array[String]] = js.native
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either
    * as a single string value for a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String]] = js.native
  /** The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.native
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a
    * bundleArray restriction is at most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.native
  /** The type of the restriction. */
  var restrictionType: js.UndefOr[String] = js.native
  /** The name of the restriction. */
  var title: js.UndefOr[String] = js.native
}

object AppRestrictionsSchemaRestriction {
  @scala.inline
  def apply(): AppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaRestriction]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaRestrictionOps[Self <: AppRestrictionsSchemaRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: AppRestrictionsSchemaRestrictionRestrictionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEntry(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedRestriction(value: js.Array[AppRestrictionsSchemaRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

