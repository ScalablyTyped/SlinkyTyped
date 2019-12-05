package typingsSlinky.flatpickr.distTypesGlobalsMod._Global_

import typingsSlinky.flatpickr.distTypesInstanceMod.FlatpickrFn
import typingsSlinky.flatpickr.distTypesInstanceMod.Instance
import typingsSlinky.flatpickr.distTypesOptionsMod.Options
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Node
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

