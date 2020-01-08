package typingsSlinky.antDashDesignDashPro.libChartsFieldMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
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
  def apply(label: TagMod[Any], value: TagMod[Any], style: CSSProperties = null): IFieldProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldProps]
  }
}

