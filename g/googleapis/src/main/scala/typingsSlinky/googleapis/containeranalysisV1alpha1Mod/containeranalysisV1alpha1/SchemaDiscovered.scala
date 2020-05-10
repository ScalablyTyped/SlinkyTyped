package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the scan status of a discovered resource.
  */
@js.native
trait SchemaDiscovered extends js.Object {
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.native
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.native
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.native
  /**
    * Output only. An operation that indicates the status of the current scan.
    * This field is deprecated, do not use.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
}

object SchemaDiscovered {
  @scala.inline
  def apply(): SchemaDiscovered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovered]
  }
  @scala.inline
  implicit class SchemaDiscoveredOps[Self <: SchemaDiscovered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalysisStatusError(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisStatusError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisStatusError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisStatusError")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousAnalysis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousAnalysis")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: SchemaOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
  }
  
}

