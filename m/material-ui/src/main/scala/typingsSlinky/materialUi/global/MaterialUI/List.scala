package typingsSlinky.materialUi.global.MaterialUI

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.List.ListProps
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.List")
@js.native
object List extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[P with SelectableProps] = js.native
}

