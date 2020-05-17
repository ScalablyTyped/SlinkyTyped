package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.ApplicationId
import typingsSlinky.gapiClientGames.anon.Oauthtoken
import typingsSlinky.gapiClientGames.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: ApplicationId): Request[Application] = js.native
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: Oauthtoken): Request[Unit] = js.native
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: PrettyPrint): Request[ApplicationVerifyResponse] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: ApplicationId => Request[Application],
    played: Oauthtoken => Request[Unit],
    verify: PrettyPrint => Request[ApplicationVerifyResponse]
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
    def withGet(value: ApplicationId => Request[Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlayed(value: Oauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: PrettyPrint => Request[ApplicationVerifyResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

