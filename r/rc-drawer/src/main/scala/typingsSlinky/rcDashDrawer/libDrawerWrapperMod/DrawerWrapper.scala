package typingsSlinky.rcDashDrawer.libDrawerWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDashDrawer.libIDrawerPropTypesMod.IDrawerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWrapper
  extends Component[IDrawerProps, IState, js.Any] {
  var dom: HTMLElement | Null = js.native
  var onClose: js.Any = js.native
  var onHandleClick: js.Any = js.native
}

