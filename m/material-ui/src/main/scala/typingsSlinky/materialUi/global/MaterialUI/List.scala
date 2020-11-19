package typingsSlinky.materialUi.global.MaterialUI

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.List.ListProps
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__MaterialUI.List")
@js.native
object List extends js.Object {
  
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[P with SelectableProps] = js.native
  
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
}
