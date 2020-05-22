package typingsSlinky.baseui.layerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  var arrowRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  var children: TagMod[Any]
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var popperRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
}

object TetherProps {
  @scala.inline
  def apply(
    anchorRef: js.UndefOr[Null | Ref[HTMLElement]] = js.undefined,
    arrowRef: js.UndefOr[Null | Ref[HTMLElement]] = js.undefined,
    children: TagMod[Any] = null,
    onPopperUpdate: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _ = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    popperRef: js.UndefOr[Null | Ref[HTMLElement]] = js.undefined
  ): TetherProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorRef)) __obj.updateDynamic("anchorRef")(anchorRef.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowRef)) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onPopperUpdate != null) __obj.updateDynamic("onPopperUpdate")(js.Any.fromFunction2(onPopperUpdate))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(popperRef)) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherProps]
  }
}

