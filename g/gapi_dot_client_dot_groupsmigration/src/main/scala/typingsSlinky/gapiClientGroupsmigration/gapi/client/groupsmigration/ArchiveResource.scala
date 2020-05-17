package typingsSlinky.gapiClientGroupsmigration.gapi.client.groupsmigration

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGroupsmigration.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: Alt): Request[Groups] = js.native
}

object ArchiveResource {
  @scala.inline
  def apply(insert: Alt => Request[Groups]): ArchiveResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[ArchiveResource]
  }
  @scala.inline
  implicit class ArchiveResourceOps[Self <: ArchiveResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: Alt => Request[Groups]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

