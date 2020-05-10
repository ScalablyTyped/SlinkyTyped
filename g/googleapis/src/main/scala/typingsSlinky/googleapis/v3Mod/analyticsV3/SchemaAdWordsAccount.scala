package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Google Ads account.
  */
@js.native
trait SchemaAdWordsAccount extends js.Object {
  /**
    * True if auto-tagging is enabled on the Google Ads account. Read-only
    * after the insert operation.
    */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Customer ID. This field is required when creating a Google Ads link.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Resource type for Google Ads account.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdWordsAccount {
  @scala.inline
  def apply(): SchemaAdWordsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdWordsAccount]
  }
  @scala.inline
  implicit class SchemaAdWordsAccountOps[Self <: SchemaAdWordsAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoTaggingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTaggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoTaggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTaggingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
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
  }
  
}

