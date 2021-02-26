package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.MessageEventID
import typingsSlinky.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentTime extends StObject {
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var fullSyncBefore: js.UndefOr[Timestamp] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
  
  var uploaded: js.UndefOr[Double] = js.native
  
  var userLastUpdated: js.UndefOr[Timestamp] = js.native
  
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.native
}
object CurrentTime {
  
  @scala.inline
  def apply(): CurrentTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTime]
  }
  
  @scala.inline
  implicit class CurrentTimeMutableBuilder[Self <: CurrentTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setFullSyncBefore(value: Timestamp): Self = StObject.set(x, "fullSyncBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSyncBeforeUndefined: Self = StObject.set(x, "fullSyncBefore", js.undefined)
    
    @scala.inline
    def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
    
    @scala.inline
    def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
    
    @scala.inline
    def setUserLastUpdated(value: Timestamp): Self = StObject.set(x, "userLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLastUpdatedUndefined: Self = StObject.set(x, "userLastUpdated", js.undefined)
    
    @scala.inline
    def setUserMaxMessageEventId(value: MessageEventID): Self = StObject.set(x, "userMaxMessageEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMaxMessageEventIdUndefined: Self = StObject.set(x, "userMaxMessageEventId", js.undefined)
  }
}
