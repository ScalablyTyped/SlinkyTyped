package typingsSlinky.materialUi.clearFixMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearFixProps extends Props[ClearFix] {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ClearFixProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    key: Key = null,
    ref: LegacyRef[ClearFix] = null,
    style: CSSProperties = null
  ): ClearFixProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearFixProps]
  }
}

