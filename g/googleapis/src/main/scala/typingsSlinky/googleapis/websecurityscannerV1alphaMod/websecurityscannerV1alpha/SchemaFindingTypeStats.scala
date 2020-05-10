package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A FindingTypeStats resource represents stats regarding a specific
  * FindingType of Findings under a given ScanRun.
  */
@js.native
trait SchemaFindingTypeStats extends js.Object {
  /**
    * Output only. The count of findings belonging to this finding type.
    */
  var findingCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The finding type associated with the stats.
    */
  var findingType: js.UndefOr[String] = js.native
}

object SchemaFindingTypeStats {
  @scala.inline
  def apply(): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
  @scala.inline
  implicit class SchemaFindingTypeStatsOps[Self <: SchemaFindingTypeStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindingCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingType")(js.undefined)
        ret
    }
  }
  
}

