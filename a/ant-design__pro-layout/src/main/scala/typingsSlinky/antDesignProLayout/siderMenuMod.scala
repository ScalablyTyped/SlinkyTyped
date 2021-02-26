package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siderMenuMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps] = js.native
  
  type _To = ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `siderMenuMod.foo` */
  override def _to: ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps] = default
}
