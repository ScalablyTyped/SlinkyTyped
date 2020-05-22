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
  def apply(
    Password: Password = null,
    Ttl: js.UndefOr[Ttl] = js.undefined,
    Uris: Uris = null,
    Username: Username = null
  ): IceServer = {
    val __obj = js.Dynamic.literal()
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (!js.isUndefined(Ttl)) __obj.updateDynamic("Ttl")(Ttl.get.asInstanceOf[js.Any])
    if (Uris != null) __obj.updateDynamic("Uris")(Uris.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceServer]
  }
}

