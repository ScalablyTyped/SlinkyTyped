package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZones extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  def ConvertTime(SourceDateTime: VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): VarDate = js.native
  
  val Count: Double = js.native
  
  val CurrentTimeZone: TimeZone = js.native
  
  def Item(Index: js.Any): TimeZone = js.native
  
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: TimeZones = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object TimeZones {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConvertTime: (VarDate, TimeZone, TimeZone) => VarDate,
    Count: Double,
    CurrentTimeZone: TimeZone,
    Item: js.Any => TimeZone,
    OutlookDotTimeZones_typekey: TimeZones,
    Parent: js.Any,
    Session: NameSpace
  ): TimeZones = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConvertTime = js.Any.fromFunction3(ConvertTime), Count = Count.asInstanceOf[js.Any], CurrentTimeZone = CurrentTimeZone.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZones_typekey")(OutlookDotTimeZones_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZones]
  }
  
  @scala.inline
  implicit class TimeZonesMutableBuilder[Self <: TimeZones] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertTime(value: (VarDate, TimeZone, TimeZone) => VarDate): Self = StObject.set(x, "ConvertTime", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeZone(value: TimeZone): Self = StObject.set(x, "CurrentTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => TimeZone): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotTimeZones_typekey(value: TimeZones): Self = StObject.set(x, "Outlook.TimeZones_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
