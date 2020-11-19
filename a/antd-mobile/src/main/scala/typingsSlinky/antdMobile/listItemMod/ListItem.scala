package typingsSlinky.antdMobile.listItemMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  
  var debounceTimeout: js.Any = js.native
  
  def onClick(ev: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
}
