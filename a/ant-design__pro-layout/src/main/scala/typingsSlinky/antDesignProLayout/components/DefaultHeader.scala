package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultHeader {
  
  @scala.inline
  def apply(matchMenuKeys: js.Array[String]): SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[typingsSlinky.antDesignProLayout.mod.DefaultHeader] = {
    val __props = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
    new SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[typingsSlinky.antDesignProLayout.mod.DefaultHeader](js.Array(this.component, __props.asInstanceOf[HeaderViewProps with PrivateSiderMenuProps]))
  }
  
  @JSImport("@ant-design/pro-layout", "DefaultHeader")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HeaderViewProps with PrivateSiderMenuProps): SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[typingsSlinky.antDesignProLayout.mod.DefaultHeader] = new SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[typingsSlinky.antDesignProLayout.mod.DefaultHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
}
