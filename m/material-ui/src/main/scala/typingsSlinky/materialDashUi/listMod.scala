package typingsSlinky.materialDashUi

import slinky.core.ReactComponentClass
import typingsSlinky.materialDashUi.__MaterialUI.List.ListItemProps
import typingsSlinky.materialDashUi.__MaterialUI.List.ListProps
import typingsSlinky.materialDashUi.__MaterialUI.List.SelectableProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/List", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ListProps, js.Object, js.Any]
  
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[P with SelectableProps] = js.native
}

