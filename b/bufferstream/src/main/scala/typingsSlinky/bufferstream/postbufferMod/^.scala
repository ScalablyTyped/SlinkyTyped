package typingsSlinky.bufferstream.postbufferMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bufferstream/postbuffer", JSImport.Namespace)
@js.native
class ^ protected () extends PostBuffer {
  /** for if you want to get all the post data from a http server request and do some db request before. */
  def this(req: IncomingMessage) = this()
}
