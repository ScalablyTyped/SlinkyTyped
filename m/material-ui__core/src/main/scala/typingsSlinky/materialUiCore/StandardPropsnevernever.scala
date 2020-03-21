package typingsSlinky.materialUiCore

import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.withStylesMod.ClassNameMap
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
@js.native
trait StandardPropsnevernever extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object StandardPropsnevernever {
  @scala.inline
  def apply(
    className: String = null,
    classes: Partial[ClassNameMap[scala.Nothing]] = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    style: CSSProperties = null
  ): StandardPropsnevernever = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardPropsnevernever]
  }
}

