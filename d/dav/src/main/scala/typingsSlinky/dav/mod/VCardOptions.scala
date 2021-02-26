package typingsSlinky.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.VCard> */
@js.native
trait VCardOptions extends StObject {
  
  var addressBook: js.UndefOr[AddressBook] = js.native
  
  var addressData: js.UndefOr[String] = js.native
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object VCardOptions {
  
  @scala.inline
  def apply(): VCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCardOptions]
  }
  
  @scala.inline
  implicit class VCardOptionsMutableBuilder[Self <: VCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBook(value: AddressBook): Self = StObject.set(x, "addressBook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBookUndefined: Self = StObject.set(x, "addressBook", js.undefined)
    
    @scala.inline
    def setAddressData(value: String): Self = StObject.set(x, "addressData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressDataUndefined: Self = StObject.set(x, "addressData", js.undefined)
    
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[VCardOptions] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
