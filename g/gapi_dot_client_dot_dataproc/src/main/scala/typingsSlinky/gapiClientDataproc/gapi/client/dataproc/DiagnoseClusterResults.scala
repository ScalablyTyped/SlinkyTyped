package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnoseClusterResults extends js.Object {
  /** Output-only. The Google Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics. */
  var outputUri: js.UndefOr[String] = js.native
}

object DiagnoseClusterResults {
  @scala.inline
  def apply(): DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnoseClusterResults]
  }
  @scala.inline
  implicit class DiagnoseClusterResultsOps[Self <: DiagnoseClusterResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(js.undefined)
        ret
    }
  }
  
}

