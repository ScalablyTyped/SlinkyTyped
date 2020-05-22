package typingsSlinky.reactNavigationStack.typesMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.anon.TintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderBackButtonProps extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var backImage: js.UndefOr[js.Function1[/* props */ TintColor, TagMod[Any]]] = js.undefined
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var layoutPreset: HeaderLayoutPreset
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  var scene: Scene
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var truncatedTitle: js.UndefOr[String | Null] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  def onPress(): Unit
}

object HeaderBackButtonProps {
  @scala.inline
  def apply(
    layoutPreset: HeaderLayoutPreset,
    onPress: () => Unit,
    scene: Scene,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    backImage: /* props */ TintColor => TagMod[Any] = null,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: js.UndefOr[Null | String] = js.undefined,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    truncatedTitle: js.UndefOr[Null | String] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): HeaderBackButtonProps = {
    val __obj = js.Dynamic.literal(layoutPreset = layoutPreset.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress), scene = scene.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.get.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1(backImage))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(truncatedTitle)) __obj.updateDynamic("truncatedTitle")(truncatedTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBackButtonProps]
  }
}

