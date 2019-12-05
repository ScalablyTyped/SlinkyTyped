package typingsSlinky.draftDashConvert

import slinky.core.TagMod
import typingsSlinky.draftDashConvert.draftDashConvertMod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends _Tag {
  var element: TagMod[Any]
  var empty: js.UndefOr[TagMod[Any]] = js.undefined
}

object Anon_Element {
  @scala.inline
  def apply(element: TagMod[Any], empty: TagMod[Any] = null): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Element]
  }
}

