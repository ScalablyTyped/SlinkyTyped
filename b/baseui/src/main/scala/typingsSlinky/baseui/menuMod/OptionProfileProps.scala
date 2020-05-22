package typingsSlinky.baseui.menuMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.baseui.anon.Body
import typingsSlinky.baseui.anon.ListItemProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProfileProps extends BaseMenuPropsT {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.undefined
  var item: js.Any
  var overrides: js.UndefOr[ListItemProfile] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  def getProfileItemImg(item: js.Any): String | ReactComponentClass[_]
  def getProfileItemImgText(item: js.Any): String
  def getProfileItemLabels(item: js.Any): Body
}

object OptionProfileProps {
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ReactComponentClass[_],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => Body,
    item: js.Any,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => TagMod[Any] = null,
    overrides: ListItemProfile = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    resetMenu: () => Unit = null
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.get.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    __obj.asInstanceOf[OptionProfileProps]
  }
}

