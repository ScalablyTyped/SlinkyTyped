package typingsSlinky.draftConvert.anon

import slinky.core.TagMod
import typingsSlinky.draftConvert.mod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends _Tag {
  var element: TagMod[Any]
  var empty: js.UndefOr[TagMod[Any]] = js.undefined
}

object Element {
  @scala.inline
  def apply(element: TagMod[Any] = null, empty: TagMod[Any] = null): Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

