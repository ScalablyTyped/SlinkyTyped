package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTemplateInfo extends js.Object {
  /**
    * The SHA 256 hash that you used to create the request signature.
    */
  var ContentSha256: js.UndefOr[TemplateContentSha256] = js.native
  /**
    * The URL for the user interface template.
    */
  var Url: js.UndefOr[TemplateUrl] = js.native
}

object UiTemplateInfo {
  @scala.inline
  def apply(): UiTemplateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiTemplateInfo]
  }
  @scala.inline
  implicit class UiTemplateInfoOps[Self <: UiTemplateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSha256(value: TemplateContentSha256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentSha256")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: TemplateUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

