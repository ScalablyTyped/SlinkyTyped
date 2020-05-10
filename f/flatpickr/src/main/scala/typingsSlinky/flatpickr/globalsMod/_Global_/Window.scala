package typingsSlinky.flatpickr.globalsMod._Global_

import org.scalajs.dom.raw.Node
import typingsSlinky.flatpickr.instanceMod.FlatpickrFn
import typingsSlinky.flatpickr.instanceMod.Instance
import typingsSlinky.flatpickr.optionsMod.Options
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("flatpickr")
  var flatpickr_Original: FlatpickrFn = js.native
  def flatpickr(selector: String): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: String, config: Options): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node]): js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
  def flatpickr(selector: Node): Instance = js.native
  def flatpickr(selector: Node, config: Options): Instance = js.native
}

