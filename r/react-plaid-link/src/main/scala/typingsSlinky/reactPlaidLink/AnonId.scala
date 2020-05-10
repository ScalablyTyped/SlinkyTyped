package typingsSlinky.reactPlaidLink

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonId extends js.Object {
  var id: String = js.native
  var mask: String = js.native
  var name: String = js.native
  var subtype: String = js.native
  var `type`: String = js.native
  var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null = js.native
}

object AnonId {
  @scala.inline
  def apply(id: String, mask: String, name: String, subtype: String, `type`: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
  @scala.inline
  implicit class AnonIdOps[Self <: AnonId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification_status(value: pending_automatic_verification | pending_manual_verification | manually_verified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification_statusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification_status")(null)
        ret
    }
  }
  
}

