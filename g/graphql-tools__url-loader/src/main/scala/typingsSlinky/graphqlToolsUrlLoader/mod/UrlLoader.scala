package typingsSlinky.graphqlToolsUrlLoader.mod

import typingsSlinky.graphqlToolsDelegate.typesMod.AsyncExecutor
import typingsSlinky.graphqlToolsDelegate.typesMod.Subscriber
import typingsSlinky.graphqlToolsUrlLoader.anon.DefaultMethod
import typingsSlinky.graphqlToolsUrlLoader.anon.Executor
import typingsSlinky.graphqlToolsUrlLoader.anon.Schema
import typingsSlinky.graphqlToolsUrlLoader.anon.Typeofw3cwebsocket
import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/url-loader", "UrlLoader")
@js.native
class UrlLoader () extends Loader[DocumentPointerSingle, LoadFromUrlOptions] {
  
  def buildAsyncExecutor(hasPointerFetchExtraHeadersDefaultMethodUseGETForQueries: DefaultMethod): AsyncExecutor = js.native
  
  def buildSubscriber(pointer: String, webSocketImpl: Typeofw3cwebsocket): Subscriber = js.native
  
  @JSName("canLoadSync")
  def canLoadSync_MUrlLoader(pointer: SchemaPointerSingle, _options: LoadFromUrlOptions): Boolean = js.native
  
  def getExecutorAndSubscriber(pointer: SchemaPointerSingle, options: LoadFromUrlOptions): js.Promise[Executor] = js.native
  
  def getSubschemaConfig(pointer: SchemaPointerSingle, options: LoadFromUrlOptions): js.Promise[Schema] = js.native
  
  @JSName("loadSync")
  def loadSync_MUrlLoader(): scala.Nothing = js.native
}
