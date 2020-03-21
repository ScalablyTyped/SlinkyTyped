package typingsSlinky.materialUi.mod

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui", "makeSelectable")
@js.native
object makeSelectable extends js.Object {
  def apply[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[P with SelectableProps] = js.native
}

