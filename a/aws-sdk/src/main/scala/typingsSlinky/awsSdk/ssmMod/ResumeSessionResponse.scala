package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeSessionResponse extends js.Object {
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SessionId] = js.native
  /**
    * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: wss://ssmmessages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output).  region represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in Systems Manager Service Endpoints in the AWS General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
    */
  var StreamUrl: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StreamUrl] = js.native
  /**
    * An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.
    */
  var TokenValue: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TokenValue] = js.native
}

object ResumeSessionResponse {
  @scala.inline
  def apply(): ResumeSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeSessionResponse]
  }
  @scala.inline
  implicit class ResumeSessionResponseOps[Self <: ResumeSessionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionId(value: SessionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamUrl(value: StreamUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenValue(value: TokenValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenValue")(js.undefined)
        ret
    }
  }
  
}

