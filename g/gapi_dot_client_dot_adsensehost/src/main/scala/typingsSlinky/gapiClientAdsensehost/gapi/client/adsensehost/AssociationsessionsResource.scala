package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsensehost.AnonOauthtoken
import typingsSlinky.gapiClientAdsensehost.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: AnonOauthtoken): Request_[AssociationSession] = js.native
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: AnonPrettyPrint): Request_[AssociationSession] = js.native
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: AnonOauthtoken => Request_[AssociationSession],
    verify: AnonPrettyPrint => Request_[AssociationSession]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[AssociationsessionsResource]
  }
  @scala.inline
  implicit class AssociationsessionsResourceOps[Self <: AssociationsessionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStart(value: AnonOauthtoken => Request_[AssociationSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: AnonPrettyPrint => Request_[AssociationSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

