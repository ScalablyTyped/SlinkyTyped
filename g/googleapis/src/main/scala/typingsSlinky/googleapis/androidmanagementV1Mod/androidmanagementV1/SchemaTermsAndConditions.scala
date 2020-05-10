package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A terms and conditions page to be accepted during provisioning.
  */
@js.native
trait SchemaTermsAndConditions extends js.Object {
  /**
    * A well-formatted HTML string. It will be parsed on the client with
    * android.text.Html#fromHtml.
    */
  var content: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[SchemaUserFacingMessage] = js.native
}

object SchemaTermsAndConditions {
  @scala.inline
  def apply(): SchemaTermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTermsAndConditions]
  }
  @scala.inline
  implicit class SchemaTermsAndConditionsOps[Self <: SchemaTermsAndConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
  }
  
}

