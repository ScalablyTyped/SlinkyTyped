package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonApplicationId
import typingsSlinky.gapiClientGames.AnonOauthtoken
import typingsSlinky.gapiClientGames.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: AnonApplicationId): Request_[Application] = js.native
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: AnonPrettyPrint): Request_[ApplicationVerifyResponse] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: AnonApplicationId => Request_[Application],
    played: AnonOauthtoken => Request_[Unit],
    verify: AnonPrettyPrint => Request_[ApplicationVerifyResponse]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), played = js.Any.fromFunction1(played), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[ApplicationsResource]
  }
  @scala.inline
  implicit class ApplicationsResourceOps[Self <: ApplicationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonApplicationId => Request_[Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlayed(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: AnonPrettyPrint => Request_[ApplicationVerifyResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

