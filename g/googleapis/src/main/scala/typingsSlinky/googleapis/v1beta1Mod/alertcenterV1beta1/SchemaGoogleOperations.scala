package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An incident reported by Google Operations for a G Suite application.
  */
@js.native
trait SchemaGoogleOperations extends js.Object {
  /**
    * The list of emails which correspond to the users directly affected by the
    * incident.
    */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Application-specific data for an incident, provided when the G
    * Suite application which reported the incident cannot be completely
    * restored to a valid state.
    */
  var attachmentData: js.UndefOr[SchemaAttachment] = js.native
  /**
    * A detailed, freeform incident description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A one-line incident description.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleOperations {
  @scala.inline
  def apply(): SchemaGoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleOperations]
  }
  @scala.inline
  implicit class SchemaGoogleOperationsOps[Self <: SchemaGoogleOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedUserEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedUserEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedUserEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedUserEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentData(value: SchemaAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentData")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

