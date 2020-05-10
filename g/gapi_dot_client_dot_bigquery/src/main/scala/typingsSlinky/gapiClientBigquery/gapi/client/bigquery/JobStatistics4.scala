package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics4 extends js.Object {
  /**
    * [Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the
    * URIs specified in the 'destinationUris' field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.native
}

object JobStatistics4 {
  @scala.inline
  def apply(): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics4]
  }
  @scala.inline
  implicit class JobStatistics4Ops[Self <: JobStatistics4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationUriFileCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUriFileCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUriFileCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUriFileCounts")(js.undefined)
        ret
    }
  }
  
}

