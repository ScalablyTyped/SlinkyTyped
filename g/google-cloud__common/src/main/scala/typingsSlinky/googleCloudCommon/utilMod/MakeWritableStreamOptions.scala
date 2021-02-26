package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleCloudCommon.anon.ContentType
import typingsSlinky.googleCloudCommon.anon.OnAuthenticated
import typingsSlinky.teenyRequest.mod.Options
import typingsSlinky.teenyRequest.mod.OptionsWithUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeWritableStreamOptions extends StObject {
  
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.native
  
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: OnAuthenticated): Unit = js.native
  
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[ContentType] = js.native
  
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.native
}
object MakeWritableStreamOptions {
  
  @scala.inline
  def apply(makeAuthenticatedRequest: (OptionsWithUri, OnAuthenticated) => Unit): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
  
  @scala.inline
  implicit class MakeWritableStreamOptionsMutableBuilder[Self <: MakeWritableStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setMakeAuthenticatedRequest(value: (OptionsWithUri, OnAuthenticated) => Unit): Self = StObject.set(x, "makeAuthenticatedRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadata(value: ContentType): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
