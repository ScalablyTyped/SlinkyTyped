package typingsSlinky.awsSdkClientS3Browser.typesStorageClassAnalysisMod

import typingsSlinky.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod.StorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClassAnalysis extends js.Object {
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
}

object StorageClassAnalysis {
  @scala.inline
  def apply(): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageClassAnalysis]
  }
  @scala.inline
  implicit class StorageClassAnalysisOps[Self <: StorageClassAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataExport(value: StorageClassAnalysisDataExport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataExport")(js.undefined)
        ret
    }
  }
  
}

