package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlusdomains.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaResource extends js.Object {
  /**
    * Add a new media item to an album. The current upload size limitations are 36MB for a photo and 1GB for a video. Uploads do not count against quota if
    * photos are less than 2048 pixels on their longest side or videos are less than 15 minutes in length.
    */
  def insert(request: PrettyPrint): Request[Media] = js.native
}

object MediaResource {
  @scala.inline
  def apply(insert: PrettyPrint => Request[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[MediaResource]
  }
  @scala.inline
  implicit class MediaResourceOps[Self <: MediaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

