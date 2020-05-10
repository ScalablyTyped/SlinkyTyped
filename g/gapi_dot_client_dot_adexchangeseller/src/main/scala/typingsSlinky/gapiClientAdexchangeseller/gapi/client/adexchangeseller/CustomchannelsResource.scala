package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangeseller.AnonAdClientId
import typingsSlinky.gapiClientAdexchangeseller.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AnonAdClientId): Request_[CustomChannel] = js.native
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: AnonFields): Request_[CustomChannels] = js.native
}

object CustomchannelsResource {
  @scala.inline
  def apply(get: AnonAdClientId => Request_[CustomChannel], list: AnonFields => Request_[CustomChannels]): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomchannelsResource]
  }
  @scala.inline
  implicit class CustomchannelsResourceOps[Self <: CustomchannelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAdClientId => Request_[CustomChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[CustomChannels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

