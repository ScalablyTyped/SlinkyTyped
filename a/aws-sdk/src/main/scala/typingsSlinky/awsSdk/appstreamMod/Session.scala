package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The authentication method. The user is authenticated using a streaming URL (API) or SAML 2.0 federation (SAML).
    */
  var AuthenticationType: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.AuthenticationType] = js.native
  /**
    * Specifies whether a user is connected to the streaming session.
    */
  var ConnectionState: js.UndefOr[SessionConnectionState] = js.native
  /**
    * The name of the fleet for the streaming session.
    */
  var FleetName: String = js.native
  /**
    * The identifier of the streaming session.
    */
  var Id: String = js.native
  /**
    * The time when the streaming session is set to expire. This time is based on the MaxUserDurationinSeconds value, which determines the maximum length of time that a streaming session can run. A streaming session might end earlier than the time specified in SessionMaxExpirationTime, when the DisconnectTimeOutInSeconds elapses or the user chooses to end his or her session. If the DisconnectTimeOutInSeconds elapses, or the user chooses to end his or her session, the streaming instance is terminated and the streaming session ends.
    */
  var MaxExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * The network details for the streaming session.
    */
  var NetworkAccessConfiguration: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.NetworkAccessConfiguration] = js.native
  /**
    * The name of the stack for the streaming session.
    */
  var StackName: String = js.native
  /**
    * The time when a streaming instance is dedicated for the user.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The current state of the streaming session.
    */
  var State: SessionState = js.native
  /**
    * The identifier of the user for whom the session was created.
    */
  var UserId: typingsSlinky.awsSdk.appstreamMod.UserId = js.native
}

object Session {
  @scala.inline
  def apply(FleetName: String, Id: String, StackName: String, State: SessionState, UserId: UserId): Session = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: SessionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationType(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionState(value: SessionConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAccessConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAccessConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAccessConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
  }
  
}

