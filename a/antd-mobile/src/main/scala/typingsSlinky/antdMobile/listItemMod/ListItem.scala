package typingsSlinky.antdMobile.listItemMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  def onClick(ev: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
}

