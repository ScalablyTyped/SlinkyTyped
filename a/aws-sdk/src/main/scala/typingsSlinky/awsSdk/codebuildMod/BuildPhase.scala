package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildPhase extends StObject {
  
  /**
    * Additional information about a build phase, especially to help troubleshoot a failed build.
    */
  var contexts: js.UndefOr[PhaseContexts] = js.native
  
  /**
    * How long, in seconds, between the starting and ending times of the build's phase.
    */
  var durationInSeconds: js.UndefOr[WrapperLong] = js.native
  
  /**
    * When the build phase ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The current status of the build phase. Valid values include:  FAILED  The build phase failed.  FAULT  The build phase faulted.  IN_PROGRESS  The build phase is still in progress.  QUEUED  The build has been submitted and is queued behind other submitted builds.  STOPPED  The build phase stopped.  SUCCEEDED  The build phase succeeded.  TIMED_OUT  The build phase timed out.  
    */
  var phaseStatus: js.UndefOr[StatusType] = js.native
  
  /**
    * The name of the build phase. Valid values include:    BUILD: Core build activities typically occur in this build phase.    COMPLETED: The build has been completed.    DOWNLOAD_SOURCE: Source code is being downloaded in this build phase.    FINALIZING: The build process is completing in this build phase.    INSTALL: Installation activities typically occur in this build phase.    POST_BUILD: Post-build activities typically occur in this build phase.    PRE_BUILD: Pre-build activities typically occur in this build phase.    PROVISIONING: The build environment is being set up.    QUEUED: The build has been submitted and is queued behind other submitted builds.    SUBMITTED: The build has been submitted.    UPLOAD_ARTIFACTS: Build output artifacts are being uploaded to the output location.  
    */
  var phaseType: js.UndefOr[BuildPhaseType] = js.native
  
  /**
    * When the build phase started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}
object BuildPhase {
  
  @scala.inline
  def apply(): BuildPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildPhase]
  }
  
  @scala.inline
  implicit class BuildPhaseMutableBuilder[Self <: BuildPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: PhaseContexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: PhaseContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDurationInSeconds(value: WrapperLong): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setPhaseStatus(value: StatusType): Self = StObject.set(x, "phaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseStatusUndefined: Self = StObject.set(x, "phaseStatus", js.undefined)
    
    @scala.inline
    def setPhaseType(value: BuildPhaseType): Self = StObject.set(x, "phaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseTypeUndefined: Self = StObject.set(x, "phaseType", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
