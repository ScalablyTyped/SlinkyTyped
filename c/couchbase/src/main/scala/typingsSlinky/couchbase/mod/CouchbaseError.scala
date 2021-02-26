package typingsSlinky.couchbase.mod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The virtual class thrown for all Couchnode errors.
  */
@js.native
trait CouchbaseError extends Error {
  
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.native
  
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.native
  
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.native
}
object CouchbaseError {
  
  @scala.inline
  def apply(message: String, name: String): CouchbaseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CouchbaseError]
  }
  
  @scala.inline
  implicit class CouchbaseErrorMutableBuilder[Self <: CouchbaseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: errors): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setInnerError(value: CouchbaseError): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    @scala.inline
    def setResponseBody(value: js.Any): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
  }
}
