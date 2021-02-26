package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Determines the shape of the response
@js.native
trait ReadResponseHeaders extends StObject {
  
  var resolveWithFullResponse: `true` = js.native
}
object ReadResponseHeaders {
  
  @scala.inline
  def apply(resolveWithFullResponse: `true`): ReadResponseHeaders = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = resolveWithFullResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResponseHeaders]
  }
  
  @scala.inline
  implicit class ReadResponseHeadersMutableBuilder[Self <: ReadResponseHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveWithFullResponse(value: `true`): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
  }
}
