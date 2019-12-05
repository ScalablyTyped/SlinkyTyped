package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashSelect.srcCreatableMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/creatable", JSImport.Namespace)
@js.native
object creatableMod extends js.Object {
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactDashSelect.srcCreatableMod.Creatable[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactDashSelect.srcCreatableMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeCreatableSelect(SelectComponent: ReactComponentClass[_]): typingsSlinky.reactDashSelect.srcCreatableMod.Creatable[_] = js.native
  /* static members */
  @js.native
  object Creatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

