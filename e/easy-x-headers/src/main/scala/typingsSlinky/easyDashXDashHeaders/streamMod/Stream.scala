package typingsSlinky.easyDashXDashHeaders.streamMod

import typingsSlinky.easyDashXDashHeaders.Anon_End
import typingsSlinky.easyDashXDashHeaders.NodeJS.WritableStream
import typingsSlinky.easyDashXDashHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

