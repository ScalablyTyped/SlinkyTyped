package typingsSlinky.rbx.dropdownContainerMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownContainerModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var align: js.UndefOr[right] = js.undefined
  var as: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]] = js.undefined
  var managed: js.UndefOr[Boolean] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object DropdownContainerModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    align: right = null,
    as: ReactComponentClass[_] = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    innerRef: js.UndefOr[Null | (Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]])] = js.undefined,
    managed: js.UndefOr[Boolean] = js.undefined,
    up: js.UndefOr[Boolean] = js.undefined
  ): DropdownContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(managed)) __obj.updateDynamic("managed")(managed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownContainerModifierProps]
  }
}

