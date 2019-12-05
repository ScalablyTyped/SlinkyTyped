package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashSelect.srcAsyncMod.AsyncComponentProps
import typingsSlinky.reactDashSelect.srcAsyncMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactDashSelect.srcAsyncMod.Async[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactDashSelect.srcAsyncMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeAsyncSelect[T /* <: ReactComponentClass[_] */](SelectComponent: T): ReactComponentClass[AsyncComponentProps[T]] = js.native
  /* static members */
  @js.native
  object Async extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

