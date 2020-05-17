package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsResource extends js.Object {
  /** Inserts conversions. */
  def batchinsert(request: Key): Request[ConversionsBatchInsertResponse] = js.native
  /** Updates existing conversions. */
  def batchupdate(request: Key): Request[ConversionsBatchUpdateResponse] = js.native
}

object ConversionsResource {
  @scala.inline
  def apply(
    batchinsert: Key => Request[ConversionsBatchInsertResponse],
    batchupdate: Key => Request[ConversionsBatchUpdateResponse]
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
    def withBatchinsert(value: Key => Request[ConversionsBatchInsertResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchinsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBatchupdate(value: Key => Request[ConversionsBatchUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchupdate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

