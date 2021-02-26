package typingsSlinky.httperr.mod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of the HttpError class. */
@js.native
trait HttpError extends Error {
  
  var code: String = js.native
  
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double = js.native
  
  /** A human-readable title for the HTTP error. */
  var title: String = js.native
  
  def toObject(skip: (String | js.RegExp)*): js.Any = js.native
}
object HttpError {
  
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | js.RegExp => js.Any
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[HttpError]
  }
  
  @scala.inline
  implicit class HttpErrorMutableBuilder[Self <: HttpError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToObject(value: /* repeated */ String | js.RegExp => js.Any): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
