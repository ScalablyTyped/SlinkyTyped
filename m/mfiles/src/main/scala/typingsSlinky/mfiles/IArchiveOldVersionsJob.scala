package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFExportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArchiveOldVersionsJob extends StObject {
  
  var AtLeastNDaysOlder: Double = js.native
  
  var AtLeastNVersionsOlder: Double = js.native
  
  var CheckedInBefore: ITimestamp = js.native
  
  def Clone(): IArchiveOldVersionsJob = js.native
  
  var Flags: MFExportContentFlag = js.native
  
  var Impersonation: IImpersonation = js.native
  
  var MarkedForArchiving: Boolean = js.native
  
  var NoVersionTag: Boolean = js.native
  
  var TargetLocation: String = js.native
  
  var UseAtLeastNDaysOlder: Boolean = js.native
  
  var UseAtLeastNVersionsOlder: Boolean = js.native
  
  var UseCheckedInBefore: Boolean = js.native
}
object IArchiveOldVersionsJob {
  
  @scala.inline
  def apply(
    AtLeastNDaysOlder: Double,
    AtLeastNVersionsOlder: Double,
    CheckedInBefore: ITimestamp,
    Clone: () => IArchiveOldVersionsJob,
    Flags: MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: Boolean,
    NoVersionTag: Boolean,
    TargetLocation: String,
    UseAtLeastNDaysOlder: Boolean,
    UseAtLeastNVersionsOlder: Boolean,
    UseCheckedInBefore: Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder.asInstanceOf[js.Any], AtLeastNVersionsOlder = AtLeastNVersionsOlder.asInstanceOf[js.Any], CheckedInBefore = CheckedInBefore.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MarkedForArchiving = MarkedForArchiving.asInstanceOf[js.Any], NoVersionTag = NoVersionTag.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseAtLeastNDaysOlder = UseAtLeastNDaysOlder.asInstanceOf[js.Any], UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder.asInstanceOf[js.Any], UseCheckedInBefore = UseCheckedInBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
  
  @scala.inline
  implicit class IArchiveOldVersionsJobMutableBuilder[Self <: IArchiveOldVersionsJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtLeastNDaysOlder(value: Double): Self = StObject.set(x, "AtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtLeastNVersionsOlder(value: Double): Self = StObject.set(x, "AtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedInBefore(value: ITimestamp): Self = StObject.set(x, "CheckedInBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IArchiveOldVersionsJob): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: MFExportContentFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkedForArchiving(value: Boolean): Self = StObject.set(x, "MarkedForArchiving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoVersionTag(value: Boolean): Self = StObject.set(x, "NoVersionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocation(value: String): Self = StObject.set(x, "TargetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAtLeastNDaysOlder(value: Boolean): Self = StObject.set(x, "UseAtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAtLeastNVersionsOlder(value: Boolean): Self = StObject.set(x, "UseAtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCheckedInBefore(value: Boolean): Self = StObject.set(x, "UseCheckedInBefore", value.asInstanceOf[js.Any])
  }
}
