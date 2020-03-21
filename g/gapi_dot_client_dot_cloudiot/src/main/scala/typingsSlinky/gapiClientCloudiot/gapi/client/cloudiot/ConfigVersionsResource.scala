package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudiot.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigVersionsResource extends js.Object {
  /**
    * Lists the last few versions of the device configuration in descending
    * order (i.e.: newest first).
    */
  def list(request: AnonAccesstoken): Request_[ListDeviceConfigVersionsResponse]
}

object ConfigVersionsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => Request_[ListDeviceConfigVersionsResponse]): ConfigVersionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConfigVersionsResource]
  }
}

