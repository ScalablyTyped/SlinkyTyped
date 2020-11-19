package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignProLayout.anon.ChangeSetting
import typingsSlinky.antDesignProLayout.anon.PartialProSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LayoutChange {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ChangeSetting): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(changeSetting: (String, js.Any, js.UndefOr[Boolean]) => Unit, settings: PartialProSettings): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(changeSetting = js.Any.fromFunction3(changeSetting), settings = settings.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ChangeSetting]))
  }
}
