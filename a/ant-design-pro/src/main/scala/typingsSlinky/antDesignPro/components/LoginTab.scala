package typingsSlinky.antDesignPro.components

import typingsSlinky.antDesignPro.anon.AddTab
import typingsSlinky.antDesignPro.loginTabMod.LoginTabProps
import typingsSlinky.antDesignPro.loginTabMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginTab {
  
  @scala.inline
  def apply(tabUtil: AddTab): SharedBuilder_LoginTabProps_1090029391[default] = {
    val __props = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    new SharedBuilder_LoginTabProps_1090029391[default](js.Array(this.component, __props.asInstanceOf[LoginTabProps]))
  }
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginTabProps): SharedBuilder_LoginTabProps_1090029391[default] = new SharedBuilder_LoginTabProps_1090029391[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
