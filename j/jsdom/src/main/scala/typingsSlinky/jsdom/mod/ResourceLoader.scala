package typingsSlinky.jsdom.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsdom", "ResourceLoader")
@js.native
class ResourceLoader () extends js.Object {
  def this(obj: ResourceLoaderConstructorOptions) = this()
  
  def fetch(url: String, options: FetchOptions): js.Promise[Buffer] | Null = js.native
}
