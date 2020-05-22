package typingsSlinky.draftConvert.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object

object _Tag {
  @scala.inline
  def Empty(end: String, start: String, empty: String = null): _Tag = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
  @scala.inline
  def Element(element: TagMod[Any] = null, empty: TagMod[Any] = null): _Tag = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
}

