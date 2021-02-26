package typingsSlinky.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncCreatableMod {
  
  @JSImport("react-select/src/AsyncCreatable", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends AsyncCreatable[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/AsyncCreatable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/AsyncCreatable", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
    
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
    
    var mounted: Boolean = js.native
    
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
    
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    
    var select: Ref[_] = js.native
  }
  /* static members */
  object AsyncCreatable {
    
    @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/AsyncCreatable", "AsyncCreatable.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactSelect.srcAsyncMod.Props[OptionType] with typingsSlinky.reactSelect.srcCreatableMod.Props[OptionType]
  
  type State[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactSelect.srcAsyncMod.State[OptionType] with typingsSlinky.reactSelect.srcCreatableMod.State[OptionType]
}
