package typingsSlinky.baseui.listMod

import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuAdapterPropsT extends PropsT {
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  @JSName("$size")
  var $size: String
  // eslint-disable-next-line flowtype/no-weak-types
  var item: js.Any
  def onClick(event: SyntheticMouseEvent[HTMLLIElement]): js.Any
  def onMouseEnter(event: SyntheticMouseEvent[HTMLLIElement]): js.Any
}

object MenuAdapterPropsT {
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    onMouseEnter: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    artwork: TagMod[Any] = null,
    artworkSize: ArtworkSizesT | Double = null,
    children: TagMod[Any] = null,
    endEnhancer: TagMod[Any] = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): MenuAdapterPropsT = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuAdapterPropsT]
  }
}

