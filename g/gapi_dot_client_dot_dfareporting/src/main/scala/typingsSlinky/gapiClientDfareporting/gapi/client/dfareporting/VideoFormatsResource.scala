package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFieldsId
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: AnonFieldsId): Request_[VideoFormat]
  /** Lists available video formats. */
  def list(request: AnonKey): Request_[VideoFormatsListResponse]
}

object VideoFormatsResource {
  @scala.inline
  def apply(get: AnonFieldsId => Request_[VideoFormat], list: AnonKey => Request_[VideoFormatsListResponse]): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoFormatsResource]
  }
}

