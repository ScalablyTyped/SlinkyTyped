package typingsSlinky.jackrabbit.mod.jackrabbit

import typingsSlinky.jackrabbit.AnonAmqp
import typingsSlinky.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JackRabbit extends EventEmitter {
  def close(callback: js.Function1[/* e */ js.Error, _]): Unit = js.native
  def default(): Exchange = js.native
  def direct(): Exchange = js.native
  def direct(name: String): Exchange = js.native
  def fanout(): Exchange = js.native
  def fanout(name: String): Exchange = js.native
  def getInternals(): AnonAmqp = js.native
  def topic(): Exchange = js.native
  def topic(name: String): Exchange = js.native
}

