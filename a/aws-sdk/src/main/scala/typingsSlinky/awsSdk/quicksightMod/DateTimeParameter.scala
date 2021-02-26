package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeParameter extends StObject {
  
  /**
    * A display name for the date-time parameter.
    */
  var Name: NonEmptyString = js.native
  
  /**
    * The values for the date-time parameter.
    */
  var Values: TimestampList = js.native
}
object DateTimeParameter {
  
  @scala.inline
  def apply(Name: NonEmptyString, Values: TimestampList): DateTimeParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeParameter]
  }
  
  @scala.inline
  implicit class DateTimeParameterMutableBuilder[Self <: DateTimeParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: TimestampList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Date*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
