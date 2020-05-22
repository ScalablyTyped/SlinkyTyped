package typingsSlinky.baseui.listMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsT extends js.Object {
  var artwork: js.UndefOr[TagMod[Any]] = js.undefined
  var artworkSize: js.UndefOr[ArtworkSizesT | Double] = js.undefined
  var children: TagMod[Any]
  var endEnhancer: js.UndefOr[TagMod[Any]] = js.undefined
  var overrides: js.UndefOr[OverridesT] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object PropsT {
  @scala.inline
  def apply(
    artwork: TagMod[Any] = null,
    artworkSize: ArtworkSizesT | Double = null,
    children: TagMod[Any] = null,
    endEnhancer: TagMod[Any] = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): PropsT = {
    val __obj = js.Dynamic.literal()
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsT]
  }
}

