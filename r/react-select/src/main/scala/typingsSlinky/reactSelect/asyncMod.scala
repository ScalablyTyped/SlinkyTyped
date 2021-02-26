package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.reactSelect.srcAsyncMod.AsyncComponentProps
import typingsSlinky.reactSelect.srcAsyncMod.Props
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("react-select/async", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected ()
    extends typingsSlinky.reactSelect.srcAsyncMod.default[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/async", "Async")
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] protected ()
    extends typingsSlinky.reactSelect.srcAsyncMod.Async[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object Async {
    
    @JSImport("react-select/async", "Async")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async", "Async.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/async", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  @JSImport("react-select/async", "makeAsyncSelect")
  @js.native
  def makeAsyncSelect[T /* <: ReactComponentClass[_] */](SelectComponent: T): ReactComponentClass[AsyncComponentProps[T]] = js.native
}
