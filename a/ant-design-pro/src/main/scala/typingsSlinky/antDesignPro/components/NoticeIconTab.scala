package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconTabProps
import typingsSlinky.antDesignPro.noticeIconTabMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIconTab
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name, style, title */
  def apply(
    locale: js.Any,
    onClear: js.Any => Unit,
    onClick: js.Any => Unit,
    onViewMore: js.Any => Unit,
    count: Int | Double = null,
    data: js.Array[_] = null,
    emptyImage: String = null,
    emptyText: TagMod[Any] = null,
    list: js.Array[NoticeIconData] = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showViewMore: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emptyImage != null) __obj.updateDynamic("emptyImage")(emptyImage.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.asInstanceOf[js.Any])
    if (!js.isUndefined(showViewMore)) __obj.updateDynamic("showViewMore")(showViewMore.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NoticeIconTabProps
}

