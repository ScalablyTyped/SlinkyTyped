package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportReadGroupSetsResponse extends js.Object {
  /** IDs of the read group sets that were created. */
  var readGroupSetIds: js.UndefOr[js.Array[String]] = js.native
}

object ImportReadGroupSetsResponse {
  @scala.inline
  def apply(): ImportReadGroupSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportReadGroupSetsResponse]
  }
  @scala.inline
  implicit class ImportReadGroupSetsResponseOps[Self <: ImportReadGroupSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadGroupSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadGroupSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSetIds")(js.undefined)
        ret
    }
  }
  
}

