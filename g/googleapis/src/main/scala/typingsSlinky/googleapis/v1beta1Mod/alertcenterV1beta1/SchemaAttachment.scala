package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment with application-specific information about an alert.
  */
@js.native
trait SchemaAttachment extends js.Object {
  /**
    * A CSV file attachment.
    */
  var csv: js.UndefOr[SchemaCsv] = js.native
}

object SchemaAttachment {
  @scala.inline
  def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  @scala.inline
  implicit class SchemaAttachmentOps[Self <: SchemaAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsv(value: SchemaCsv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
  }
  
}

