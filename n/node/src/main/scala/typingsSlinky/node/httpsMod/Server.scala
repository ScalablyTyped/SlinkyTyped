package typingsSlinky.node.httpsMod

import typingsSlinky.node.httpMod.HttpBase
import typingsSlinky.node.httpMod.RequestListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server ()
  extends typingsSlinky.node.tlsMod.Server
     with HttpBase {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
}

