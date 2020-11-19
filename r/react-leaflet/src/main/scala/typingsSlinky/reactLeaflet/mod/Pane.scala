package typingsSlinky.reactLeaflet.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactLeaflet.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Pane")
@js.native
class Pane[P /* <: PaneProps */, S /* <: PaneState */] ()
  extends Component[P, S, js.Any] {
  
  def createPane(props: P): Unit = js.native
  
  def getPane(): js.UndefOr[HTMLElement | Null] = js.native
  def getPane(name: String): js.UndefOr[HTMLElement | Null] = js.native
  
  def getParentPane(): js.UndefOr[HTMLElement | Null] = js.native
  
  def removePane(): Unit = js.native
  
  def setStyle(arg: ClassName): Unit = js.native
}
