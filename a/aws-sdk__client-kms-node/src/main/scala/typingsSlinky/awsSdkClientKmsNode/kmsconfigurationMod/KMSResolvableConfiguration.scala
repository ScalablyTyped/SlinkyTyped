package typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod

import typingsSlinky.awsSdkTypes.marshallerMod.RequestSerializer
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSResolvableConfiguration extends KMSConfiguration {
  
  /**
    * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
    */
  var _user_injected_http_handler: js.Any = js.native
  
  /**
    * A function that can calculate the length of a request body.
    */
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  /**
    * The parser to use when converting HTTP responses to SDK output types
    */
  var parser: ResponseParser[Readable] = js.native
  
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  def serializer(): js.Promise[RequestSerializer[Readable]] = js.native
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable]] = js.native
}
