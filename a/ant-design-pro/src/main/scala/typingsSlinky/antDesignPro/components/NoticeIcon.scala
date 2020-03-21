package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.AnonDictkey
import typingsSlinky.antDesignPro.noticeIconMod.NoticeIconProps
import typingsSlinky.antDesignPro.noticeIconMod.default
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIcon
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    bell: TagMod[Any] = null,
    clearClose: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: AnonDictkey = null,
    onClear: /* tabName */ String => Unit = null,
    onItemClick: (/* item */ NoticeIconData, /* tabProps */ NoticeIconProps) => Unit = null,
    onPopupVisibleChange: /* visible */ Boolean => Unit = null,
    onTabChange: /* tabTile */ String => Unit = null,
    onViewMore: (/* tabProps */ NoticeIconProps, /* e */ MouseEvent) => Unit = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (bell != null) __obj.updateDynamic("bell")(bell.asInstanceOf[js.Any])
    if (!js.isUndefined(clearClose)) __obj.updateDynamic("clearClose")(clearClose.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (onViewMore != null) __obj.updateDynamic("onViewMore")(js.Any.fromFunction2(onViewMore))
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antDesignPro.noticeIconMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NoticeIconProps
}

