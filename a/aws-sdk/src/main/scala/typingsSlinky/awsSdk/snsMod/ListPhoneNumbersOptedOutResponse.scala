package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersOptedOutResponse extends StObject {
  
  /**
    * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
    */
  var phoneNumbers: js.UndefOr[PhoneNumberList] = js.native
}
object ListPhoneNumbersOptedOutResponse {
  
  @scala.inline
  def apply(): ListPhoneNumbersOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
  }
  
  @scala.inline
  implicit class ListPhoneNumbersOptedOutResponseMutableBuilder[Self <: ListPhoneNumbersOptedOutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: java.lang.String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPhoneNumbers(value: PhoneNumberList): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
  }
}
