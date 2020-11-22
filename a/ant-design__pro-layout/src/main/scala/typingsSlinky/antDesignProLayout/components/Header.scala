package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.headerMod.default
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("@ant-design/pro-layout/lib/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HeaderViewProps with PrivateSiderMenuProps): SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[default] = new SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(matchMenuKeys: js.Array[String]): SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[default] = {
    val __props = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
    new SharedBuilder_HeaderViewPropsPrivateSiderMenuProps_330522065[default](js.Array(this.component, __props.asInstanceOf[HeaderViewProps with PrivateSiderMenuProps]))
  }
}
