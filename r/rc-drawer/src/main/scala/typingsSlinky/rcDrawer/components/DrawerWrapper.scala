package typingsSlinky.rcDrawer.components

import typingsSlinky.rcDrawer.drawerWrapperMod.default
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerWrapper {
  
  @JSImport("rc-drawer/es/DrawerWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DrawerWrapper.type): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDrawerProps): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
