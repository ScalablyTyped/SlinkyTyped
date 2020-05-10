package typingsSlinky.bunyanWinstonAdapter

import typingsSlinky.bunyan.mod.^
import typingsSlinky.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan-winston-adapter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createAdapter(logger: Logger): ^ = js.native
  def createAdapter(logger: Logger, mapping: js.Any): ^ = js.native
}

