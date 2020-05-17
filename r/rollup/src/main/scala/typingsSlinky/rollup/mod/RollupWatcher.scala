package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWatcher extends TypedEventEmitter[Change] {
  def close(): Unit = js.native
}

