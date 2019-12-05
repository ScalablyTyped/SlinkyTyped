package typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.ReactDataGrid

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashDataDashGrid.AdazzleReactDataGrid.EditorBaseProps
import typingsSlinky.reactDashDataDashGrid.Anon_Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors")
@js.native
object editors extends js.Object {
  @js.native
  class EditorBase[P, S] ()
    extends Component[P with EditorBaseProps, S, js.Any] {
    def getInputNode(): Element | Null | Text = js.native
    def getStyle(): Anon_Width = js.native
    def getValue(): js.Any = js.native
    def inheritContainerStyles(): Boolean = js.native
  }
  
}

