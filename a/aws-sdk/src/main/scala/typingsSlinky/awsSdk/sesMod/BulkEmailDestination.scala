package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkEmailDestination extends js.Object {
  var Destination: typingsSlinky.awsSdk.sesMod.Destination = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendBulkTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.native
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[TemplateData] = js.native
}

object BulkEmailDestination {
  @scala.inline
  def apply(Destination: Destination): BulkEmailDestination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailDestination]
  }
  @scala.inline
  implicit class BulkEmailDestinationOps[Self <: BulkEmailDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacementTags(value: MessageTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacementTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementTags")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacementTemplateData(value: TemplateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementTemplateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacementTemplateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementTemplateData")(js.undefined)
        ret
    }
  }
  
}

