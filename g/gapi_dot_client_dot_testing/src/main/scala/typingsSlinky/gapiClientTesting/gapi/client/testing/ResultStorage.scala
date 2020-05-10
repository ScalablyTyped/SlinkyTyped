package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStorage extends js.Object {
  /** Required. */
  var googleCloudStorage: js.UndefOr[GoogleCloudStorage] = js.native
  /**
    * The tool results execution that results are written to.
    * @OutputOnly
    */
  var toolResultsExecution: js.UndefOr[ToolResultsExecution] = js.native
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.
    *
    * Optional, if not provided the service will choose an appropriate value.
    */
  var toolResultsHistory: js.UndefOr[ToolResultsHistory] = js.native
}

object ResultStorage {
  @scala.inline
  def apply(): ResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultStorage]
  }
  @scala.inline
  implicit class ResultStorageOps[Self <: ResultStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleCloudStorage(value: GoogleCloudStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCloudStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withToolResultsExecution(value: ToolResultsExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolResultsExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withToolResultsHistory(value: ToolResultsHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolResultsHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsHistory")(js.undefined)
        ret
    }
  }
  
}

