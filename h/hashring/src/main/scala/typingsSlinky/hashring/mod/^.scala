package typingsSlinky.hashring.mod

import typingsSlinky.hashring.anon.PartialHashRingOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hashring", JSImport.Namespace)
@js.native
class ^ protected () extends HashRing {
  def this(servers: Servers) = this()
  def this(servers: Servers, algorithm: String) = this()
  def this(servers: Servers, algorithm: js.Function1[/* key */ String, String | Buffer]) = this()
  def this(servers: Servers, algorithm: js.UndefOr[scala.Nothing], options: PartialHashRingOptions) = this()
  def this(servers: Servers, algorithm: String, options: PartialHashRingOptions) = this()
  def this(
    servers: Servers,
    algorithm: js.Function1[/* key */ String, String | Buffer],
    options: PartialHashRingOptions
  ) = this()
}
