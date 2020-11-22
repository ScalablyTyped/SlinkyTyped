package typingsSlinky.reactOverlays.dropdownMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.anon.Props
import typingsSlinky.reactOverlays.dropdownContextMod.DropDirection
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`false`
import typingsSlinky.reactOverlays.reactOverlaysBooleans.`true`
import typingsSlinky.reactOverlays.reactOverlaysStrings.keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  def children(arg: Props): ReactElement = js.native
  
  var defaultShow: js.UndefOr[Boolean] = js.native
  
  var drop: js.UndefOr[DropDirection] = js.native
  
  var focusFirstItemOnShow: js.UndefOr[`false` | `true` | keyboard] = js.native
  
  var itemSelector: js.UndefOr[String] = js.native
  
  def onToggle(nextShow: Boolean): Unit = js.native
  def onToggle(nextShow: Boolean, event: SyntheticEvent[Event, Element]): Unit = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
