package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.Anon_AddTab
import typingsSlinky.antDashDesignDashPro.libLoginLoginTabMod.LoginTabProps
import typingsSlinky.antDashDesignDashPro.libLoginLoginTabMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginTab
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(tabUtil: Anon_AddTab, tab: TagMod[Any] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LoginTabProps
}

