package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchComplianceData extends js.Object {
  
  /**
    * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
    */
  var CVEIds: js.UndefOr[PatchCVEIds] = js.native
  
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: PatchClassification = js.native
  
  /**
    * The date/time the patch was installed on the instance. Note that not all operating systems provide this level of information.
    */
  var InstalledTime: js.Date = js.native
  
  /**
    * The operating system-specific ID of the patch.
    */
  var KBId: PatchKbNumber = js.native
  
  /**
    * The severity of the patch (for example, Critical, Important, Moderate).
    */
  var Severity: PatchSeverity = js.native
  
  /**
    * The state of the patch on the instance, such as INSTALLED or FAILED. For descriptions of each patch state, see About patch compliance in the AWS Systems Manager User Guide.
    */
  var State: PatchComplianceDataState = js.native
  
  /**
    * The title of the patch.
    */
  var Title: PatchTitle = js.native
}
object PatchComplianceData {
  
  @scala.inline
  def apply(
    Classification: PatchClassification,
    InstalledTime: js.Date,
    KBId: PatchKbNumber,
    Severity: PatchSeverity,
    State: PatchComplianceDataState,
    Title: PatchTitle
  ): PatchComplianceData = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], InstalledTime = InstalledTime.asInstanceOf[js.Any], KBId = KBId.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchComplianceData]
  }
  
  @scala.inline
  implicit class PatchComplianceDataOps[Self <: PatchComplianceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassification(value: PatchClassification): Self = this.set("Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledTime(value: js.Date): Self = this.set("InstalledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKBId(value: PatchKbNumber): Self = this.set("KBId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: PatchSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PatchComplianceDataState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: PatchTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVEIds(value: PatchCVEIds): Self = this.set("CVEIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCVEIds: Self = this.set("CVEIds", js.undefined)
  }
}
