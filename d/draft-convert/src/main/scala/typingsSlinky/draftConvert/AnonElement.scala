package typingsSlinky.draftConvert

import slinky.core.TagMod
import typingsSlinky.draftConvert.mod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends _Tag {
  var element: TagMod[Any]
  var empty: js.UndefOr[TagMod[Any]] = js.undefined
}

object AnonElement {
  @scala.inline
  def apply(element: TagMod[Any], empty: TagMod[Any] = null): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement]
  }
}

