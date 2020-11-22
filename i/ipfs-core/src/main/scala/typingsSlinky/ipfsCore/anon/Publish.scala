package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.publishMod.PublishResult
import typingsSlinky.ipfsCore.publishMod.PublishSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends js.Object {
  
  def publish(value: String): js.Promise[PublishResult] = js.native
  def publish(value: String, options: PublishSettings with AbortOptions): js.Promise[PublishResult] = js.native
  
  var pubsub: Cancel = js.native
  
  def resolve(name: String): AsyncIterable[String] = js.native
  def resolve(name: String, options: ResolveSettings with AbortOptions): AsyncIterable[String] = js.native
}
