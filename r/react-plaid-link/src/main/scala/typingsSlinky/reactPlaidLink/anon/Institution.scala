package typingsSlinky.reactPlaidLink.anon

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.choose_device
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.institution_not_found
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_code
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_credentials
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_questions
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.requires_selections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Institution extends js.Object {
  var institution: Name = js.native
  var link_session_id: String | Null = js.native
  var request_id: String | Null = js.native
  var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found = js.native
}

object Institution {
  @scala.inline
  def apply(
    institution: Name,
    status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
  ): Institution = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
  @scala.inline
  implicit class InstitutionOps[Self <: Institution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstitution(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_session_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_session_id")(null)
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(null)
        ret
    }
  }
  
}

