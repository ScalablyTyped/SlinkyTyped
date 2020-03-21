package typingsSlinky.rollup.mod

import typingsSlinky.rollup.AnonChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatcher extends TypedEventEmitter[AnonChange] {
  def close(): Unit = js.native
}

