package typingsSlinky.reactPlaidLink.anon

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var mask: String
  var name: String
  var subtype: String
  var `type`: String
  var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null
}

object Id {
  @scala.inline
  def apply(
    id: String,
    mask: String,
    name: String,
    subtype: String,
    `type`: String,
    verification_status: pending_automatic_verification | pending_manual_verification | manually_verified = null
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], verification_status = verification_status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

