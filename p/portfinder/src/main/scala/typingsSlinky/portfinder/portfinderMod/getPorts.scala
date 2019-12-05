package typingsSlinky.portfinder.portfinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portfinder", "getPorts")
@js.native
object getPorts extends js.Object {
  def apply(
    count: Double,
    options: PortFinderOptions,
    callback: js.Function2[/* err */ js.Error, /* ports */ js.Array[Double], Unit]
  ): Unit = js.native
}

