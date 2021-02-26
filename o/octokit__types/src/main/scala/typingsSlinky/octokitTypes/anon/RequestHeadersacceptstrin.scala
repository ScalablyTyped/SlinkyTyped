package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @octokit/types.@octokit/types/dist-types/RequestHeaders.RequestHeaders & {  accept :string,   user-agent :string} */
@js.native
trait RequestHeadersacceptstrin
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  
  /**
    * Avoid setting `headers.accept`, use `mediaType.{format|previews}` option instead.
    */
  var accept: js.UndefOr[String] with String = js.native
  
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[String] = js.native
  
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
  var `user-agent`: js.UndefOr[String] with String = js.native
}
object RequestHeadersacceptstrin {
  
  @scala.inline
  def apply(accept: js.UndefOr[String] with String, `user-agent`: js.UndefOr[String] with String): RequestHeadersacceptstrin = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHeadersacceptstrin]
  }
  
  @scala.inline
  implicit class RequestHeadersacceptstrinMutableBuilder[Self <: RequestHeadersacceptstrin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: js.UndefOr[String] with String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def `setUser-agent`(value: js.UndefOr[String] with String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
  }
}
