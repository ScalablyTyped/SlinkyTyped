package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateArchiveRequest extends StObject {
  
  /**
    * The name of the archive to update.
    */
  var ArchiveName: typingsSlinky.awsSdk.eventbridgeMod.ArchiveName = js.native
  
  /**
    * The description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.native
  
  /**
    * The event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.EventPattern] = js.native
  
  /**
    * The number of days to retain events in the archive.
    */
  var RetentionDays: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.RetentionDays] = js.native
}
object UpdateArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): UpdateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRequest]
  }
  
  @scala.inline
  implicit class UpdateArchiveRequestMutableBuilder[Self <: UpdateArchiveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
