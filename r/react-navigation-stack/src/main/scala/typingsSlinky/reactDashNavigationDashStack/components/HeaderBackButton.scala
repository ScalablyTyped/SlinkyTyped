package typingsSlinky.reactDashNavigationDashStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNavigationDashStack.Anon_TintColor
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderBackButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderBackButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderBackButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    onPress: () => Unit,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    backImage: /* props */ Anon_TintColor => TagMod[Any] = null,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1(backImage))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderBackButtonMod.Props
}

