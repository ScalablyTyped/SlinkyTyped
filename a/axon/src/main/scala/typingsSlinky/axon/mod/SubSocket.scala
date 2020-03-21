package typingsSlinky.axon.mod

import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "SubSocket")
@js.native
class SubSocket () extends Socket_ {
  def clearSubscriptions(): Unit = js.native
  def hasSubscriptions(): Boolean = js.native
  def matches(topic: String): Boolean = js.native
  /**
    * @throws {Error}
    */
  def send(): Unit = js.native
  def subscribe(re: String): js.RegExp = js.native
  def subscribe(re: RegExp): js.RegExp = js.native
  def unsubscribe(re: String): Unit = js.native
  def unsubscribe(re: RegExp): Unit = js.native
}

