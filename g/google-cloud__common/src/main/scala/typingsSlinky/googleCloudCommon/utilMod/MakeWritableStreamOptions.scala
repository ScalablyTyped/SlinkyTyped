package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleCloudCommon.AnonContentType
import typingsSlinky.googleCloudCommon.AnonOnAuthenticated
import typingsSlinky.teenyRequest.mod.Options
import typingsSlinky.teenyRequest.mod.OptionsWithUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeWritableStreamOptions extends js.Object {
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.undefined
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[AnonContentType] = js.undefined
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.undefined
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: AnonOnAuthenticated): Unit
}

object MakeWritableStreamOptions {
  @scala.inline
  def apply(
    makeAuthenticatedRequest: (OptionsWithUri, AnonOnAuthenticated) => Unit,
    connection: js.Object = null,
    metadata: AnonContentType = null,
    request: Options = null
  ): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
}

