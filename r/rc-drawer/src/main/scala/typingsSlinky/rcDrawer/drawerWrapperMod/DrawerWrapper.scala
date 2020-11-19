package typingsSlinky.rcDrawer.drawerWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerWrapper
  extends Component[IDrawerProps, IState, js.Any] {
  
  var dom: HTMLElement | Null = js.native
  
  var onClose: js.Any = js.native
  
  var onHandleClick: js.Any = js.native
}
