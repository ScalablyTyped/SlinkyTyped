package typingsSlinky.isProgressive

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-progressive", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def buffer(buffer: Buffer): Boolean = js.native
  
  def file(filepath: String): js.Promise[Boolean] = js.native
  
  def fileSync(filepath: String): Boolean = js.native
  
  def stream(stream: Readable): js.Promise[Boolean] = js.native
}
