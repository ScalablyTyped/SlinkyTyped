package typingsSlinky.materialUiCore.withStylesMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
}

object StyledComponentProps {
  @scala.inline
  def apply[ClassKey](
    classes: Partial[ClassNameMap[ClassKey]] = null,
    innerRef: js.UndefOr[Null | Ref[_] | ReactRef[_]] = js.undefined
  ): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
}

