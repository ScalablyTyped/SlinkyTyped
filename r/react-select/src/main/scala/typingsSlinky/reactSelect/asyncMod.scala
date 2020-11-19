package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.srcAsyncMod.AsyncComponentProps
import typingsSlinky.reactSelect.srcAsyncMod.Props
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  
  val defaultProps: Props[js.Any] = js.native
  
  def makeAsyncSelect[T /* <: ReactComponentClass[_] */](SelectComponent: T): ReactComponentClass[AsyncComponentProps[T]] = js.native
  
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactSelect.srcAsyncMod.Async[OptionType]
  /* static members */
  @js.native
  object Async extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsSlinky.reactSelect.srcAsyncMod.default[OptionType]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
}
