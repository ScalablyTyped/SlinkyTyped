package typingsSlinky.antDesignPro.fieldMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldProps extends js.Object {
  var label: TagMod[Any]
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: TagMod[Any]
}

object IFieldProps {
  @scala.inline
  def apply(label: TagMod[Any] = null, style: CSSProperties = null, value: TagMod[Any] = null): IFieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldProps]
  }
}

