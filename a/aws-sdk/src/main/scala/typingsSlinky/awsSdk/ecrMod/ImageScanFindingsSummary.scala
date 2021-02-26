package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanFindingsSummary extends StObject {
  
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
  implicit class ImageScanFindingsSummaryMutableBuilder[Self <: ImageScanFindingsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingSeverityCounts(value: FindingSeverityCounts): Self = StObject.set(x, "findingSeverityCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingSeverityCountsUndefined: Self = StObject.set(x, "findingSeverityCounts", js.undefined)
    
    @scala.inline
    def setImageScanCompletedAt(value: js.Date): Self = StObject.set(x, "imageScanCompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanCompletedAtUndefined: Self = StObject.set(x, "imageScanCompletedAt", js.undefined)
    
    @scala.inline
    def setVulnerabilitySourceUpdatedAt(value: js.Date): Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVulnerabilitySourceUpdatedAtUndefined: Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", js.undefined)
  }
}
