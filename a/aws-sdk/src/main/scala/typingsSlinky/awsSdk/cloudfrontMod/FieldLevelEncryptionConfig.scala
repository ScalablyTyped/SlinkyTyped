package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionConfig extends js.Object {
  /**
    * A unique number that ensures the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment about the configuration.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
    */
  var ContentTypeProfileConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.native
  /**
    * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
    */
  var QueryArgProfileConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.native
}

object FieldLevelEncryptionConfig {
  @scala.inline
  def apply(CallerReference: String): FieldLevelEncryptionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionConfig]
  }
  @scala.inline
  implicit class FieldLevelEncryptionConfigOps[Self <: FieldLevelEncryptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTypeProfileConfig(value: ContentTypeProfileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentTypeProfileConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTypeProfileConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentTypeProfileConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryArgProfileConfig(value: QueryArgProfileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryArgProfileConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryArgProfileConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryArgProfileConfig")(js.undefined)
        ret
    }
  }
  
}

