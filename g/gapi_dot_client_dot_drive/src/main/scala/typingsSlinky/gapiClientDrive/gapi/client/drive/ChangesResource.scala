package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonFields
import typingsSlinky.gapiClientDrive.AnonIncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: AnonFields): Request_[StartPageToken] = js.native
  /** Lists the changes for a user or Team Drive. */
  def list(request: AnonIncludeCorpusRemovals): Request_[ChangeList] = js.native
  /** Subscribes to changes for a user. */
  def watch(request: AnonIncludeCorpusRemovals): Request_[Channel] = js.native
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: AnonFields => Request_[StartPageToken],
    list: AnonIncludeCorpusRemovals => Request_[ChangeList],
    watch: AnonIncludeCorpusRemovals => Request_[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ChangesResource]
  }
  @scala.inline
  implicit class ChangesResourceOps[Self <: ChangesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStartPageToken(value: AnonFields => Request_[StartPageToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartPageToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonIncludeCorpusRemovals => Request_[ChangeList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonIncludeCorpusRemovals => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

