package typingsSlinky.draftDashConvert.draftDashConvertMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object

object _Tag {
  @scala.inline
  def Anon_Empty(end: String, start: String, empty: String = null): _Tag = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
  @scala.inline
  def Anon_Element(element: TagMod[Any], empty: TagMod[Any] = null): _Tag = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
}

