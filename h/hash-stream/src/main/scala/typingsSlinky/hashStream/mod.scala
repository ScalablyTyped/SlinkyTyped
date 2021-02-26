package typingsSlinky.hashStream

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hash-stream", JSImport.Namespace)
  @js.native
  def apply(filename: String, algorithm: String): js.Promise[Buffer] = js.native
  @JSImport("hash-stream", JSImport.Namespace)
  @js.native
  def apply(
    filename: String,
    algorithm: String,
    callback: js.Function2[/* error */ js.Error | Null, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
  @JSImport("hash-stream", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, algorithm: String): js.Promise[Buffer] = js.native
  @JSImport("hash-stream", JSImport.Namespace)
  @js.native
  def apply(
    stream: Readable,
    algorithm: String,
    callback: js.Function2[/* error */ js.Any, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
}
