package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locations where the results of running the test are stored.
  */
@js.native
trait SchemaResultStorage extends js.Object {
  /**
    * Required.
    */
  var googleCloudStorage: js.UndefOr[SchemaGoogleCloudStorage] = js.native
  /**
    * Output only. The tool results execution that results are written to.
    */
  var toolResultsExecution: js.UndefOr[SchemaToolResultsExecution] = js.native
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.  If not provided, the service will choose an
    * appropriate value.
    */
  var toolResultsHistory: js.UndefOr[SchemaToolResultsHistory] = js.native
}

object SchemaResultStorage {
  @scala.inline
  def apply(): SchemaResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultStorage]
  }
  @scala.inline
  implicit class SchemaResultStorageOps[Self <: SchemaResultStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleCloudStorage(value: SchemaGoogleCloudStorage): Self = {
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
    def withToolResultsExecution(value: SchemaToolResultsExecution): Self = {
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
    def withToolResultsHistory(value: SchemaToolResultsHistory): Self = {
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

