package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics AccountSummary. An AccountSummary is a
  * lightweight tree comprised of properties/profiles.
  */
@js.native
trait SchemaAccountSummary extends js.Object {
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics AccountSummary.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * List of web properties under this account.
    */
  var webProperties: js.UndefOr[js.Array[SchemaWebPropertySummary]] = js.native
}

object SchemaAccountSummary {
  @scala.inline
  def apply(): SchemaAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountSummary]
  }
  @scala.inline
  implicit class SchemaAccountSummaryOps[Self <: SchemaAccountSummary] (val x: Self) extends AnyVal {
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
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(js.undefined)
        ret
    }
    @scala.inline
    def withWebProperties(value: js.Array[SchemaWebPropertySummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webProperties")(js.undefined)
        ret
    }
  }
  
}

