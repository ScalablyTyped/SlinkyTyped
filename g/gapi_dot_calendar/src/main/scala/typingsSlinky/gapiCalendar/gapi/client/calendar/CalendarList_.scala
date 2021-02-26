package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarList_ extends StObject {
  
  var etag: typingsSlinky.gapiCalendar.gapi.client.calendar.etag = js.native
  
  var items: js.Array[CalendarListEntry] = js.native
  
  var kind: calendarNumbersigncalendarList = js.native
  
  /**
    * Token used to access the next page of this result.
    * Omitted if no further results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned.
    * Omitted if further results are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
}
object CalendarList_ {
  
  @scala.inline
  def apply(etag: etag, items: js.Array[CalendarListEntry], kind: calendarNumbersigncalendarList): CalendarList_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarList_]
  }
  
  @scala.inline
  implicit class CalendarList_MutableBuilder[Self <: CalendarList_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[CalendarListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: CalendarListEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: calendarNumbersigncalendarList): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
  }
}
