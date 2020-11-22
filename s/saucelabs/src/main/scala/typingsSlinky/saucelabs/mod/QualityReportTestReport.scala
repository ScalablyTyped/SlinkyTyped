package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saucelabs.saucelabsStrings.ABORTED
import typingsSlinky.saucelabs.saucelabsStrings.CANCELED
import typingsSlinky.saucelabs.saucelabsStrings.EDGE
import typingsSlinky.saucelabs.saucelabsStrings.ERROR
import typingsSlinky.saucelabs.saucelabsStrings.FAILURE
import typingsSlinky.saucelabs.saucelabsStrings.FULL
import typingsSlinky.saucelabs.saucelabsStrings.GPRS
import typingsSlinky.saucelabs.saucelabsStrings.GSM
import typingsSlinky.saucelabs.saucelabsStrings.HDCSD
import typingsSlinky.saucelabs.saucelabsStrings.HSDPA
import typingsSlinky.saucelabs.saucelabsStrings.OK
import typingsSlinky.saucelabs.saucelabsStrings.SKIPPED
import typingsSlinky.saucelabs.saucelabsStrings.SUCCESS
import typingsSlinky.saucelabs.saucelabsStrings.UMTS
import typingsSlinky.saucelabs.saucelabsStrings.UNDEFINED
import typingsSlinky.saucelabs.saucelabsStrings.UNKNOWN
import typingsSlinky.saucelabs.saucelabsStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualityReportTestReport
  extends /* key */ StringDictionary[js.Any] {
  
  var appVersionId: js.UndefOr[Double] = js.native
  
  var appVersionName: js.UndefOr[String] = js.native
  
  var automationBackend: js.UndefOr[String] = js.native
  
  var batchId: js.UndefOr[Id] = js.native
  
  var batchName: js.UndefOr[String] = js.native
  
  var dataCenterId: js.UndefOr[Id] = js.native
  
  var deviceDescriptor: js.UndefOr[DeviceDescriptor] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var networkSpeed: js.UndefOr[FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA] = js.native
  
  var phoneNumber: js.UndefOr[PhoneNumber] = js.native
  
  var projectPath: js.UndefOr[Path] = js.native
  
  var remoteAppFileUrl: js.UndefOr[String] = js.native
  
  var running: js.UndefOr[Boolean] = js.native
  
  var sharedLinkCode: js.UndefOr[String] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.native
  
  var steps: js.UndefOr[js.Array[Step]] = js.native
  
  var systemError: js.UndefOr[String] = js.native
  
  var systemErrorType: js.UndefOr[String] = js.native
  
  var testId: js.UndefOr[Id] = js.native
  
  var testName: js.UndefOr[String] = js.native
  
  var testResultStatus: js.UndefOr[UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED] = js.native
  
  var tunnelId: js.UndefOr[String] = js.native
  
  var tunnelIdentifier: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var uuid: js.UndefOr[Uuid] = js.native
  
  var videoId: js.UndefOr[Id] = js.native
  
  var withSystemError: js.UndefOr[Boolean] = js.native
}
object QualityReportTestReport {
  
  @scala.inline
  def apply(): QualityReportTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualityReportTestReport]
  }
  
  @scala.inline
  implicit class QualityReportTestReportOps[Self <: QualityReportTestReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppVersionId(value: Double): Self = this.set("appVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersionId: Self = this.set("appVersionId", js.undefined)
    
    @scala.inline
    def setAppVersionName(value: String): Self = this.set("appVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersionName: Self = this.set("appVersionName", js.undefined)
    
    @scala.inline
    def setAutomationBackend(value: String): Self = this.set("automationBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationBackend: Self = this.set("automationBackend", js.undefined)
    
    @scala.inline
    def setBatchId(value: Id): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setBatchName(value: String): Self = this.set("batchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchName: Self = this.set("batchName", js.undefined)
    
    @scala.inline
    def setDataCenterId(value: Id): Self = this.set("dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCenterId: Self = this.set("dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptor(value: DeviceDescriptor): Self = this.set("deviceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDescriptor: Self = this.set("deviceDescriptor", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNetworkSpeed(value: FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA): Self = this.set("networkSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSpeed: Self = this.set("networkSpeed", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setProjectPath(value: Path): Self = this.set("projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectPath: Self = this.set("projectPath", js.undefined)
    
    @scala.inline
    def setRemoteAppFileUrl(value: String): Self = this.set("remoteAppFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAppFileUrl: Self = this.set("remoteAppFileUrl", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    
    @scala.inline
    def setSharedLinkCode(value: String): Self = this.set("sharedLinkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedLinkCode: Self = this.set("sharedLinkCode", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setSystemError(value: String): Self = this.set("systemError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemError: Self = this.set("systemError", js.undefined)
    
    @scala.inline
    def setSystemErrorType(value: String): Self = this.set("systemErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemErrorType: Self = this.set("systemErrorType", js.undefined)
    
    @scala.inline
    def setTestId(value: Id): Self = this.set("testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestId: Self = this.set("testId", js.undefined)
    
    @scala.inline
    def setTestName(value: String): Self = this.set("testName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestName: Self = this.set("testName", js.undefined)
    
    @scala.inline
    def setTestResultStatus(value: UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED): Self = this.set("testResultStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResultStatus: Self = this.set("testResultStatus", js.undefined)
    
    @scala.inline
    def setTunnelId(value: String): Self = this.set("tunnelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelId: Self = this.set("tunnelId", js.undefined)
    
    @scala.inline
    def setTunnelIdentifier(value: String): Self = this.set("tunnelIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelIdentifier: Self = this.set("tunnelIdentifier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUuid(value: Uuid): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    
    @scala.inline
    def setVideoId(value: Id): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setWithSystemError(value: Boolean): Self = this.set("withSystemError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithSystemError: Self = this.set("withSystemError", js.undefined)
  }
}
