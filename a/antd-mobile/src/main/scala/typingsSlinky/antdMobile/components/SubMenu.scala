package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobile.menuPropsTypeMod.DataItem
import typingsSlinky.antdMobile.subMenuMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd-mobile/lib/menu/SubMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onSel: DataItem => Unit,
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem],
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    radioPrefixCls: String = null,
    subMenuPrefixCls: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls.asInstanceOf[js.Any])
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

