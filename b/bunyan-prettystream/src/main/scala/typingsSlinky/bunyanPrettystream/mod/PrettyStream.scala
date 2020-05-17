package typingsSlinky.bunyanPrettystream.mod

import typingsSlinky.bunyanPrettystream.anon.End
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyStream extends Writable {
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

