package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A setting for Glass.
  */
@js.native
trait SchemaSetting extends js.Object {
  /**
    * The setting&#39;s ID. The following IDs are valid:   - locale - The key
    * to the user’s language/locale (BCP 47 identifier) that Glassware should
    * use to render localized content.   - timezone - The key to the user’s
    * current time zone region as defined in the tz database. Example:
    * America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of resource. This is always mirror#setting.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The setting value, as a string.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaSetting {
  @scala.inline
  def apply(): SchemaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetting]
  }
  @scala.inline
  implicit class SchemaSettingOps[Self <: SchemaSetting] (val x: Self) extends AnyVal {
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

