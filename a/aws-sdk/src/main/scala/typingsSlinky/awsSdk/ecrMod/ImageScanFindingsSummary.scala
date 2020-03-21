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
  def apply(
    findingSeverityCounts: FindingSeverityCounts = null,
    imageScanCompletedAt: js.Date = null,
    vulnerabilitySourceUpdatedAt: js.Date = null
  ): ImageScanFindingsSummary = {
    val __obj = js.Dynamic.literal()
    if (findingSeverityCounts != null) __obj.updateDynamic("findingSeverityCounts")(findingSeverityCounts.asInstanceOf[js.Any])
    if (imageScanCompletedAt != null) __obj.updateDynamic("imageScanCompletedAt")(imageScanCompletedAt.asInstanceOf[js.Any])
    if (vulnerabilitySourceUpdatedAt != null) __obj.updateDynamic("vulnerabilitySourceUpdatedAt")(vulnerabilitySourceUpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScanFindingsSummary]
  }
}

