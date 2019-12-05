package typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.SearchBar.IProperties
import typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.SearchBar.IState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.FormEvent
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
  def handleChange(e: FormEvent[HTMLElement]): Unit = js.native
}

