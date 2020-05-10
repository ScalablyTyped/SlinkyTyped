package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFindingsSummary extends js.Object {
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.native
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[js.Date] = js.native
}

object ImageScanFindingsSummary {
  @scala.inline
  def apply(): ImageScanFindingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindingsSummary]
  }
  @scala.inline
  implicit class ImageScanFindingsSummaryOps[Self <: ImageScanFindingsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindingSeverityCounts(value: FindingSeverityCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingSeverityCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingSeverityCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingSeverityCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScanCompletedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanCompletedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanCompletedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withVulnerabilitySourceUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerabilitySourceUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVulnerabilitySourceUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerabilitySourceUpdatedAt")(js.undefined)
        ret
    }
  }
  
}

