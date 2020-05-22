package typingsSlinky.reactSketchapp.defsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any]
}

object DefsProps {
  @scala.inline
  def apply(children: js.Array[TagMod[Any]] | TagMod[Any] = null): DefsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsProps]
  }
}

