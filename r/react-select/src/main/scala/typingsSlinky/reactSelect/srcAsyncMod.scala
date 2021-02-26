package typingsSlinky.reactSelect

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.GroupType
import typingsSlinky.reactSelect.typesMod.GroupedOptionsType
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncMod {
  
  @JSImport("react-select/src/Async", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends Async[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/Async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Async", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Async", "Async")
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] protected ()
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
    
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    
    var select: Ref[_] = js.native
  }
  /* static members */
  object Async {
    
    @JSImport("react-select/src/Async", "Async")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Async", "Async.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Async", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  @JSImport("react-select/src/Async", "makeAsyncSelect")
  @js.native
  def makeAsyncSelect[T /* <: ReactComponentClass[_] */](SelectComponent: T): ReactComponentClass[AsyncComponentProps[T]] = js.native
  
  type AsyncComponentProps[T /* <: ReactComponentClass[_] */] = SelectComponentProps[T] with AsyncProps[_]
  
  @js.native
  trait AsyncProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /* If cacheOptions is truthy, then the loaded data will be cached. The cache
      will remain until `cacheOptions` changes value.
      Default: false. */
    var cacheOptions: js.UndefOr[js.Any] = js.native
    
    /* The default set of options to show before the user starts searching. When
      set to `true`, the results for loadOptions('') will be autoloaded.
      Default: false. */
    var defaultOptions: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType] | Boolean] = js.native
    
    /* Function that returns a promise, which is the set of options to be used
      once the promise resolves. */
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): js.Promise[_] | Unit = js.native
  }
  object AsyncProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](
      loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit
    ): AsyncProps[OptionType] = {
      val __obj = js.Dynamic.literal(loadOptions = js.Any.fromFunction2(loadOptions))
      __obj.asInstanceOf[AsyncProps[OptionType]]
    }
    
    @scala.inline
    implicit class AsyncPropsMutableBuilder[Self <: AsyncProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with AsyncProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def setCacheOptions(value: js.Any): Self = StObject.set(x, "cacheOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheOptionsUndefined: Self = StObject.set(x, "cacheOptions", js.undefined)
      
      @scala.inline
      def setDefaultOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType] | Boolean): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      @scala.inline
      def setDefaultOptionsVarargs(value: (GroupType[OptionType] | OptionType)*): Self = StObject.set(x, "defaultOptions", js.Array(value :_*))
      
      @scala.inline
      def setLoadOptions(value: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit): Self = StObject.set(x, "loadOptions", js.Any.fromFunction2(value))
    }
  }
  
  type ClassProps[T] = js.Any
  
  type FunctionProps[T] = js.Any
  
  type Props[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactSelect.selectMod.Props[OptionType] with AsyncProps[OptionType]
  
  type SelectComponentProps[T] = ClassProps[T] | FunctionProps[T]
  
  @js.native
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.native
    
    var inputValue: String = js.native
    
    var isLoading: Boolean = js.native
    
    var loadedInputValue: js.UndefOr[String] = js.native
    
    var loadedOptions: OptionsType[OptionType] = js.native
    
    var passEmptyOptions: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](
      inputValue: String,
      isLoading: Boolean,
      loadedOptions: OptionsType[OptionType],
      passEmptyOptions: Boolean
    ): State[OptionType] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[OptionType]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[_], OptionType /* <: OptionTypeBase */] (val x: Self with State[OptionType]) extends AnyVal {
      
      @scala.inline
      def setDefaultOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      @scala.inline
      def setDefaultOptionsVarargs(value: OptionType*): Self = StObject.set(x, "defaultOptions", js.Array(value :_*))
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedInputValue(value: String): Self = StObject.set(x, "loadedInputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedInputValueUndefined: Self = StObject.set(x, "loadedInputValue", js.undefined)
      
      @scala.inline
      def setLoadedOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "loadedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedOptionsVarargs(value: OptionType*): Self = StObject.set(x, "loadedOptions", js.Array(value :_*))
      
      @scala.inline
      def setPassEmptyOptions(value: Boolean): Self = StObject.set(x, "passEmptyOptions", value.asInstanceOf[js.Any])
    }
  }
}
