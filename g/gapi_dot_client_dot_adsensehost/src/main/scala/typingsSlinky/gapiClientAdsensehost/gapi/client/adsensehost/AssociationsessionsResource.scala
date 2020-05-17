package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.Oauthtoken
import typingsSlinky.gapiClientAdsensehost.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: Oauthtoken): Request[AssociationSession] = js.native
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: PrettyPrint): Request[AssociationSession] = js.native
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: Oauthtoken => Request[AssociationSession],
    verify: PrettyPrint => Request[AssociationSession]
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
    def withStart(value: Oauthtoken => Request[AssociationSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: PrettyPrint => Request[AssociationSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

