package typingsSlinky.rcDashSwitch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashSwitch.rcDashSwitchMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcDashSwitch
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-switch", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, checked, className, defaultChecked, disabled, onChange, onClick, tabIndex */
  def apply(
    checkedChildren: TagMod[Any] = null,
    loadingIcon: TagMod[Any] = null,
    prefixCls: String = null,
    unCheckedChildren: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checkedChildren != null) __obj.updateDynamic("checkedChildren")(checkedChildren.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (unCheckedChildren != null) __obj.updateDynamic("unCheckedChildren")(unCheckedChildren.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashSwitch.rcDashSwitchMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.rcDashSwitch.rcDashSwitchMod.Props
}

