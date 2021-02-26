package typingsSlinky.hlsParser.anon

import typingsSlinky.hlsParser.mod.types.DateRange
import typingsSlinky.hlsParser.mod.types.Key
import typingsSlinky.hlsParser.mod.types.MediaInitializationSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Byterange extends StObject {
  
  var byterange: js.UndefOr[typingsSlinky.hlsParser.mod.Byterange] = js.native
  
  var dateRange: js.UndefOr[DateRange] = js.native
  
  var discontinuity: js.UndefOr[Boolean] = js.native
  
  var discontinuitySequence: Double = js.native
  
  var duration: Double = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var map: js.UndefOr[MediaInitializationSection] = js.native
  
  var mediaSequenceNumber: Double = js.native
  
  var programDateTime: js.UndefOr[js.Date] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var uri: String = js.native
}
object Byterange {
  
  @scala.inline
  def apply(discontinuitySequence: Double, duration: Double, mediaSequenceNumber: Double, uri: String): Byterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Byterange]
  }
  
  @scala.inline
  implicit class ByterangeMutableBuilder[Self <: Byterange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByterange(value: typingsSlinky.hlsParser.mod.Byterange): Self = StObject.set(x, "byterange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByterangeUndefined: Self = StObject.set(x, "byterange", js.undefined)
    
    @scala.inline
    def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDiscontinuity(value: Boolean): Self = StObject.set(x, "discontinuity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuitySequence(value: Double): Self = StObject.set(x, "discontinuitySequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuityUndefined: Self = StObject.set(x, "discontinuity", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMap(value: MediaInitializationSection): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMediaSequenceNumber(value: Double): Self = StObject.set(x, "mediaSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTime(value: js.Date): Self = StObject.set(x, "programDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTimeUndefined: Self = StObject.set(x, "programDateTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
