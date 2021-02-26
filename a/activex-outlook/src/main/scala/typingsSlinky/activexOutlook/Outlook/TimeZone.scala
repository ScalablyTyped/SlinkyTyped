package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZone extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Bias: Double = js.native
  
  val Class: OlObjectClass = js.native
  
  val DaylightBias: Double = js.native
  
  val DaylightDate: VarDate = js.native
  
  val DaylightDesignation: String = js.native
  
  val ID: String = js.native
  
  val Name: String = js.native
  
  @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val StandardBias: Double = js.native
  
  val StandardDate: VarDate = js.native
  
  val StandardDesignation: String = js.native
}
object TimeZone {
  
  @scala.inline
  def apply(
    Application: Application,
    Bias: Double,
    Class: OlObjectClass,
    DaylightBias: Double,
    DaylightDate: VarDate,
    DaylightDesignation: String,
    ID: String,
    Name: String,
    OutlookDotTimeZone_typekey: TimeZone,
    Parent: js.Any,
    Session: NameSpace,
    StandardBias: Double,
    StandardDate: VarDate,
    StandardDesignation: String
  ): TimeZone = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bias = Bias.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DaylightBias = DaylightBias.asInstanceOf[js.Any], DaylightDate = DaylightDate.asInstanceOf[js.Any], DaylightDesignation = DaylightDesignation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StandardBias = StandardBias.asInstanceOf[js.Any], StandardDate = StandardDate.asInstanceOf[js.Any], StandardDesignation = StandardDesignation.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZone_typekey")(OutlookDotTimeZone_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit class TimeZoneMutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBias(value: Double): Self = StObject.set(x, "Bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaylightBias(value: Double): Self = StObject.set(x, "DaylightBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaylightDate(value: VarDate): Self = StObject.set(x, "DaylightDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaylightDesignation(value: String): Self = StObject.set(x, "DaylightDesignation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotTimeZone_typekey(value: TimeZone): Self = StObject.set(x, "Outlook.TimeZone_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardBias(value: Double): Self = StObject.set(x, "StandardBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDate(value: VarDate): Self = StObject.set(x, "StandardDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDesignation(value: String): Self = StObject.set(x, "StandardDesignation", value.asInstanceOf[js.Any])
  }
}
