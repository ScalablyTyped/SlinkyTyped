package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesResponse extends js.Object {
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 email templates.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.native
}

object ListTemplatesResponse {
  @scala.inline
  def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  @scala.inline
  implicit class ListTemplatesResponseOps[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplatesMetadata(value: TemplateMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplatesMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatesMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplatesMetadata")(js.undefined)
        ret
    }
  }
  
}

