package typingsSlinky.grommet

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: TagMod[Any] = null, value: js.Any = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

