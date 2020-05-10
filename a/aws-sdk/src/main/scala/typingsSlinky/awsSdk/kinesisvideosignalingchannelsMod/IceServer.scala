package typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IceServer extends js.Object {
  /**
    * A password to login to the ICE server.
    */
  var Password: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Password] = js.native
  /**
    * The period of time, in seconds, during which the username and password are valid.
    */
  var Ttl: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Ttl] = js.native
  /**
    * An array of URIs, in the form specified in the I-D.petithuguenin-behave-turn-uris spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
    */
  var Uris: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Uris] = js.native
  /**
    * A username to login to the ICE server.
    */
  var Username: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
}

object IceServer {
  @scala.inline
  def apply(): IceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IceServer]
  }
  @scala.inline
  implicit class IceServerOps[Self <: IceServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Ttl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: Uris): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uris")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

