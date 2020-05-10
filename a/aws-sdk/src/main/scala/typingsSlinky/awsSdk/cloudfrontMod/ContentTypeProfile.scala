package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfile extends js.Object {
  /**
    * The content type for a field-level encryption content type-profile mapping. 
    */
  var ContentType: String = js.native
  /**
    * The format for a field-level encryption content type-profile mapping. 
    */
  var Format: typingsSlinky.awsSdk.cloudfrontMod.Format = js.native
  /**
    * The profile ID for a field-level encryption content type-profile mapping. 
    */
  var ProfileId: js.UndefOr[String] = js.native
}

object ContentTypeProfile {
  @scala.inline
  def apply(ContentType: String, Format: Format): ContentTypeProfile = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfile]
  }
  @scala.inline
  implicit class ContentTypeProfileOps[Self <: ContentTypeProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(js.undefined)
        ret
    }
  }
  
}

