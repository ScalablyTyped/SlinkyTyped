package typingsSlinky.easyXapiSupertest.streamMod

import typingsSlinky.easyXapiSupertest.NodeJS.WritableStream
import typingsSlinky.easyXapiSupertest.anon.End
import typingsSlinky.easyXapiSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

