package typingsSlinky.natsDashHemera.natsDashHemeraMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reply extends js.Object {
  var error: js.Error = js.native
  var log: typingsSlinky.pino.pinoMod.Logger | Logger = js.native
  var payload: HemeraMessagePayload = js.native
  var sent: Boolean = js.native
  def next(message: js.Any): Unit = js.native
  def next(message: Error): Unit = js.native
  def send(message: js.Any): Unit = js.native
  def send(message: Error): Unit = js.native
}

