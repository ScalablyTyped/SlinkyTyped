package typingsSlinky.materialUi

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.List.ListProps
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.materialUi.materialUiStrings.onChange
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui/List", JSImport.Namespace)
@js.native
object materialUiListMod extends js.Object {
  
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
  
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ListProps, js.Object, js.Any]
}
