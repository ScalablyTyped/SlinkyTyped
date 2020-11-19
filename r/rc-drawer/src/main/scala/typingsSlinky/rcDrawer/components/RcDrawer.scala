package typingsSlinky.rcDrawer.components

import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import typingsSlinky.rcDrawer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcDrawer {
  
  @JSImport("rc-drawer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IDrawerProps): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcDrawer.type): SharedBuilder_IDrawerProps1544561710[default] = new SharedBuilder_IDrawerProps1544561710[default](js.Array(this.component, js.Dictionary.empty))()
}
