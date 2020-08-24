package typingsSlinky.rcDrawer.components

import typingsSlinky.rcDrawer.drawerWrapperMod.default
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerWrapper {
  @JSImport("rc-drawer/es/DrawerWrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IDrawerProps): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DrawerWrapper.type): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, js.Dictionary.empty))()
}

