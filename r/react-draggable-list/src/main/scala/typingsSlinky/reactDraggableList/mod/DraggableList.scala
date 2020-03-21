package typingsSlinky.reactDraggableList.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableList[I, C, T /* <: ReactComponentClass[Partial[TemplateProps[I, C]]] */]
  extends Component[Props[I, C, T], js.Object, js.Any] {
  def getItemInstance(key: String): T = js.native
}

