package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.Fields
import typingsSlinky.gapiClientDrive.anon.IncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: Fields): Request[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: IncludeCorpusRemovals): Request[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: IncludeCorpusRemovals): Request[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: Fields => Request[StartPageToken],
    list: IncludeCorpusRemovals => Request[ChangeList],
    watch: IncludeCorpusRemovals => Request[Channel]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(getStartPageToken = js.Any.fromFunction1(getStartPageToken), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[ChangesResource]
  }
}

