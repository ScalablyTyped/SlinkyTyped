package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: AnonKey): Request_[ConversionsBatchInsertResponse] = js.native
  /** Updates existing conversions. */
  def batchupdate(request: AnonKey): Request_[ConversionsBatchUpdateResponse] = js.native
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: AnonKey => Request_[ConversionsBatchInsertResponse],
    batchupdate: AnonKey => Request_[ConversionsBatchUpdateResponse]
  ): ConversionsResource = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction1(batchinsert), batchupdate = js.Any.fromFunction1(batchupdate))
    __obj.asInstanceOf[ConversionsResource]
  }
  @scala.inline
  implicit class ConversionsResourceOps[Self <: ConversionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchinsert(value: AnonKey => Request_[ConversionsBatchInsertResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchinsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBatchupdate(value: AnonKey => Request_[ConversionsBatchUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchupdate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

