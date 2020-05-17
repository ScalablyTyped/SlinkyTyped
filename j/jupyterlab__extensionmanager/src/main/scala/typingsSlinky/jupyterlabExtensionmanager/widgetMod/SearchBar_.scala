package typingsSlinky.jupyterlabExtensionmanager.widgetMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IState
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
@js.native
class SearchBar_ protected ()
  extends Component[IProperties, IState, js.Any] {
  def this(props: IProperties) = this()
  /**
    * Handler for search input changes.
    */
  def handleChange(e: SyntheticEvent[EventTarget with HTMLElement, Event]): Unit = js.native
}

