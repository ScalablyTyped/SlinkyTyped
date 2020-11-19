package typingsSlinky.readdirp.mod

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaddirpStream
  extends Readable
     with AsyncIterable[EntryInfo] {
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}
