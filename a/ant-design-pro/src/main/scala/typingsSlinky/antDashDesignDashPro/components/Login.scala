package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.libLoginMod.LoginProps
import typingsSlinky.antDashDesignDashPro.libLoginMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Login
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Login", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    defaultActiveKey: String = null,
    onSubmit: (/* error */ js.Any, /* values */ js.Any) => Unit = null,
    onTabChange: /* key */ String => Unit = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antDashDesignDashPro.libLoginMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LoginProps
}

