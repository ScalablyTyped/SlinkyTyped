package typingsSlinky.rcMenu.menuMod

import typingsSlinky.rcMenu.anon.BuiltinPlacements
import typingsSlinky.rcMenu.anon.PartialMenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/Menu", JSImport.Default)
@js.native
class default protected () extends Menu {
  def this(props: MenuProps) = this()
}
/* static members */
@JSImport("rc-menu/es/Menu", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: BuiltinPlacements = js.native
  
  def getDerivedStateFromProps(nextProps: MenuProps, prevState: MenuState): PartialMenuState = js.native
}
