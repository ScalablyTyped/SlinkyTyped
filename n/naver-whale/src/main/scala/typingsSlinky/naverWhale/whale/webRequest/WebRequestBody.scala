package typingsSlinky.naverWhale.whale.webRequest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestBody extends StObject {
  
  /** Optional. Errors when obtaining request body data. */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * If the request method is POST and the body is a sequence of key-value pairs encoded in UTF8, encoded as either multipart/form-data, or application/x-www-form-urlencoded, this dictionary is present and for each key contains the list of all values for that key. If the data is of another media type, or if it is malformed, the dictionary is not present. An example value of this dictionary is {'key': ['value1', 'value2']}.
    */
  var formData: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * Optional.
    * If the request method is PUT or POST, and the body is not already parsed in formData, then the unparsed request body elements are contained in this array.
    */
  var raw: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.webRequest.UploadData]] = js.native
}
object WebRequestBody {
  
  @scala.inline
  def apply(): WebRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRequestBody]
  }
  
  @scala.inline
  implicit class WebRequestBodyMutableBuilder[Self <: WebRequestBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFormData(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setRaw(value: js.Array[typingsSlinky.chrome.chrome.webRequest.UploadData]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRawVarargs(value: typingsSlinky.chrome.chrome.webRequest.UploadData*): Self = StObject.set(x, "raw", js.Array(value :_*))
  }
}
