package typingsSlinky.materialUi

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.materialUi.materialUiStrings.onChange
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui/List/makeSelectable", JSImport.Namespace)
@js.native
object makeSelectableMod extends js.Object {
  
  def default[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
  
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
}
