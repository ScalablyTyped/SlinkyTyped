package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptResponse extends js.Object {
  /**
    * The initial contact ID for the contact. 
    */
  var InitialContactId: js.UndefOr[ContactId] = js.native
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.NextToken] = js.native
  /**
    * The list of messages in the session.
    */
  var Transcript: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.Transcript] = js.native
}

object GetTranscriptResponse {
  @scala.inline
  def apply(): GetTranscriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptResponse]
  }
  @scala.inline
  implicit class GetTranscriptResponseOps[Self <: GetTranscriptResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialContactId(value: ContactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialContactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialContactId")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscript(value: Transcript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transcript")(js.undefined)
        ret
    }
  }
  
}

