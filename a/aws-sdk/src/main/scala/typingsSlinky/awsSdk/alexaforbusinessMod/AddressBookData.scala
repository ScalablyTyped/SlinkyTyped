package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressBookData extends StObject {
  
  /**
    * The ARN of the address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
  
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  
  /**
    * The name of the address book.
    */
  var Name: js.UndefOr[AddressBookName] = js.native
}
object AddressBookData {
  
  @scala.inline
  def apply(): AddressBookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressBookData]
  }
  
  @scala.inline
  implicit class AddressBookDataMutableBuilder[Self <: AddressBookData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBookArnUndefined: Self = StObject.set(x, "AddressBookArn", js.undefined)
    
    @scala.inline
    def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
