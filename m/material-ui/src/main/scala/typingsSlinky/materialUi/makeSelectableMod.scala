package typingsSlinky.materialUi

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.List.SelectableProps
import typingsSlinky.materialUi.materialUiStrings.onChange
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeSelectableMod {
  
  @JSImport("material-ui/List/makeSelectable", JSImport.Default)
  @js.native
  def default[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
  
  @JSImport("material-ui/List/makeSelectable", "makeSelectable")
  @js.native
  def makeSelectable[P /* <: js.Object */](component: ReactComponentClass[P]): ReactComponentClass[(Omit[P, onChange]) with SelectableProps] = js.native
}
