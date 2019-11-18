package typingsSlinky.node.streamMod

import typingsSlinky.node.Anon_End
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait internal extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

