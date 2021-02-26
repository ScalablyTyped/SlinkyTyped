package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.IO.CloseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IO.ReadRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IO.ReadResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.IO.ResolveBlobRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IO.ResolveBlobResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOApi extends StObject {
  
  /**
    * Close the stream, discard any temporary backing storage.
    */
  def close(params: CloseRequest): js.Promise[Unit] = js.native
  
  /**
    * Read a chunk of the stream
    */
  def read(params: ReadRequest): js.Promise[ReadResponse] = js.native
  
  /**
    * Return UUID of Blob object specified by a remote object id.
    */
  def resolveBlob(params: ResolveBlobRequest): js.Promise[ResolveBlobResponse] = js.native
}
object IOApi {
  
  @scala.inline
  def apply(
    close: CloseRequest => js.Promise[Unit],
    read: ReadRequest => js.Promise[ReadResponse],
    resolveBlob: ResolveBlobRequest => js.Promise[ResolveBlobResponse]
  ): IOApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), read = js.Any.fromFunction1(read), resolveBlob = js.Any.fromFunction1(resolveBlob))
    __obj.asInstanceOf[IOApi]
  }
  
  @scala.inline
  implicit class IOApiMutableBuilder[Self <: IOApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: CloseRequest => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: ReadRequest => js.Promise[ReadResponse]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveBlob(value: ResolveBlobRequest => js.Promise[ResolveBlobResponse]): Self = StObject.set(x, "resolveBlob", js.Any.fromFunction1(value))
  }
}
