package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s birthday. At least one of the `date` and `text` fields are
  * specified. The `date` and `text` fields typically represent the same date,
  * but are not guaranteed to.
  */
@js.native
trait SchemaBirthday extends js.Object {
  /**
    * The date of the birthday.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * Metadata about the birthday.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * A free-form string representing the user&#39;s birthday.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaBirthday {
  @scala.inline
  def apply(): SchemaBirthday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBirthday]
  }
  @scala.inline
  implicit class SchemaBirthdayOps[Self <: SchemaBirthday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: SchemaDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

