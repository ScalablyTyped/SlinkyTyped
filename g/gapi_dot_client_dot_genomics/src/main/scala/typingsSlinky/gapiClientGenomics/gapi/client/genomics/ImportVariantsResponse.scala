package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVariantsResponse extends js.Object {
  /** IDs of the call sets created during the import. */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
}

object ImportVariantsResponse {
  @scala.inline
  def apply(): ImportVariantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVariantsResponse]
  }
  @scala.inline
  implicit class ImportVariantsResponseOps[Self <: ImportVariantsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(js.undefined)
        ret
    }
  }
  
}

