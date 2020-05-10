package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFindings extends js.Object {
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.native
  /**
    * The findings from the image scan.
    */
  var findings: js.UndefOr[ImageScanFindingList] = js.native
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[js.Date] = js.native
}

object ImageScanFindings {
  @scala.inline
  def apply(): ImageScanFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindings]
  }
  @scala.inline
  implicit class ImageScanFindingsOps[Self <: ImageScanFindings] (val x: Self) extends AnyVal {
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
    def withFindings(value: ImageScanFindingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(js.undefined)
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

