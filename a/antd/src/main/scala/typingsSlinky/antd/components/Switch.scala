package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libSwitchMod.SwitchProps
import typingsSlinky.antd.libSwitchMod.SwitchSize
import typingsSlinky.antd.libSwitchMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/switch", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, checked, className, defaultChecked, disabled */
  def apply(
    checkedChildren: TagMod[Any] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    onClick: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    prefixCls: String = null,
    size: SwitchSize = null,
    style: CSSProperties = null,
    title: String = null,
    unCheckedChildren: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checkedChildren != null) __obj.updateDynamic("checkedChildren")(checkedChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unCheckedChildren != null) __obj.updateDynamic("unCheckedChildren")(unCheckedChildren.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libSwitchMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwitchProps
}

