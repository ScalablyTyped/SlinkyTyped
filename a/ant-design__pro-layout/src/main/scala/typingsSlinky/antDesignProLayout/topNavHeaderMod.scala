package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topNavHeaderMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/TopNavHeader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TopNavHeaderProps] = js.native
  
  type TopNavHeaderProps = SiderMenuProps with GlobalHeaderProps with PrivateSiderMenuProps with js.Object
  
  type _To = ReactComponentClass[TopNavHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `topNavHeaderMod.foo` */
  override def _to: ReactComponentClass[TopNavHeaderProps] = default
}
