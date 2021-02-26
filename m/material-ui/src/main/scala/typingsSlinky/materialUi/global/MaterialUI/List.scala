package typingsSlinky.materialUi.global.MaterialUI

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.List.ListProps
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.materialUi.materialUiStrings.onChange
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSGlobal("__MaterialUI.List.List")
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @JSGlobal("__MaterialUI.List.ListItem")
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @JSGlobal("__MaterialUI.List.makeSelectable")
  @js.native
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
}
