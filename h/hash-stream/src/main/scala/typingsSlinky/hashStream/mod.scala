package typingsSlinky.hashStream

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hash-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(filename: String, algorithm: String): js.Promise[Buffer] = js.native
  def apply(
    filename: String,
    algorithm: String,
    callback: js.Function2[/* error */ js.Error | Null, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
  def apply(stream: Readable, algorithm: String): js.Promise[Buffer] = js.native
  def apply(
    stream: Readable,
    algorithm: String,
    callback: js.Function2[/* error */ js.Any, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
}
