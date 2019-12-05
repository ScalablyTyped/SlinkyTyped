package typingsSlinky.immer.immerMod

import typingsSlinky.immer.immerStrings.add
import typingsSlinky.immer.immerStrings.remove
import typingsSlinky.immer.immerStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var op: replace | remove | add
  var path: js.Array[String | Double]
  var value: js.UndefOr[js.Any] = js.undefined
}

object Patch {
  @scala.inline
  def apply(op: replace | remove | add, path: js.Array[String | Double], value: js.Any = null): Patch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
}

