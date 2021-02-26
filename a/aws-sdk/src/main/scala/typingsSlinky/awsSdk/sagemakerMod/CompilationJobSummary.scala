package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilationJobSummary extends StObject {
  
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typingsSlinky.awsSdk.sagemakerMod.CompilationJobArn = js.native
  
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName = js.native
  
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typingsSlinky.awsSdk.sagemakerMod.CompilationJobStatus = js.native
  
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The type of device that the model will run on after the compilation job has completed.
    */
  var CompilationTargetDevice: js.UndefOr[TargetDevice] = js.native
  
  /**
    * The type of accelerator that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformAccelerator: js.UndefOr[TargetPlatformAccelerator] = js.native
  
  /**
    * The type of architecture that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformArch: js.UndefOr[TargetPlatformArch] = js.native
  
  /**
    * The type of OS that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformOs: js.UndefOr[TargetPlatformOs] = js.native
  
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
}
object CompilationJobSummary {
  
  @scala.inline
  def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: js.Date
  ): CompilationJobSummary = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationJobSummary]
  }
  
  @scala.inline
  implicit class CompilationJobSummaryMutableBuilder[Self <: CompilationJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilationEndTime(value: js.Date): Self = StObject.set(x, "CompilationEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationEndTimeUndefined: Self = StObject.set(x, "CompilationEndTime", js.undefined)
    
    @scala.inline
    def setCompilationJobArn(value: CompilationJobArn): Self = StObject.set(x, "CompilationJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationJobStatus(value: CompilationJobStatus): Self = StObject.set(x, "CompilationJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationStartTime(value: js.Date): Self = StObject.set(x, "CompilationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationStartTimeUndefined: Self = StObject.set(x, "CompilationStartTime", js.undefined)
    
    @scala.inline
    def setCompilationTargetDevice(value: TargetDevice): Self = StObject.set(x, "CompilationTargetDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationTargetDeviceUndefined: Self = StObject.set(x, "CompilationTargetDevice", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformAccelerator(value: TargetPlatformAccelerator): Self = StObject.set(x, "CompilationTargetPlatformAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationTargetPlatformAcceleratorUndefined: Self = StObject.set(x, "CompilationTargetPlatformAccelerator", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformArch(value: TargetPlatformArch): Self = StObject.set(x, "CompilationTargetPlatformArch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationTargetPlatformArchUndefined: Self = StObject.set(x, "CompilationTargetPlatformArch", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformOs(value: TargetPlatformOs): Self = StObject.set(x, "CompilationTargetPlatformOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationTargetPlatformOsUndefined: Self = StObject.set(x, "CompilationTargetPlatformOs", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
