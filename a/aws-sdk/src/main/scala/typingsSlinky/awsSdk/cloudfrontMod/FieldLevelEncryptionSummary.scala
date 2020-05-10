package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionSummary extends js.Object {
  /**
    * An optional comment about the field-level encryption item.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    *  A summary of a content type-profile mapping. 
    */
  var ContentTypeProfileConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.native
  /**
    * The unique ID of a field-level encryption item.
    */
  var Id: String = js.native
  /**
    * The last time that the summary of field-level encryption items was modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    *  A summary of a query argument-profile mapping. 
    */
  var QueryArgProfileConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.native
}

object FieldLevelEncryptionSummary {
  @scala.inline
  def apply(Id: String, LastModifiedTime: js.Date): FieldLevelEncryptionSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionSummary]
  }
  @scala.inline
  implicit class FieldLevelEncryptionSummaryOps[Self <: FieldLevelEncryptionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
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

