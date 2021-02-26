package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.componentsInputMod.InputProps
import typingsSlinky.reactSelect.transitionsMod.fn
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("react-select/src/animated/Input", JSImport.Default)
  @js.native
  def default(WrappedComponent: ReactComponentClass[InputProps]): ReactComponentClass[AnimatedInputProps] = js.native
  
  @JSImport("react-select/src/animated/Input", "AnimatedInput")
  @js.native
  def AnimatedInput(WrappedComponent: ReactComponentClass[InputProps]): ReactComponentClass[AnimatedInputProps] = js.native
  
  /* Inlined react-select.react-select/src/animated/transitions.BaseTransition & react-select.react-select/src/types.PropsWithInnerRef & react-select.react-select/src/components/Input.InputProps */
  @js.native
  trait AnimatedInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    /** Whether we are in a transition. */
    var in: Boolean = js.native
    
    /** The inner reference. */
    var innerRef: Ref[_] = js.native
    /** Reference to the internal element */
    def innerRef(element: Ref[_]): Unit = js.native
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    
    /** Function to be called once transition finishes. */
    var onExited: fn = js.native
    
    var theme: Theme = js.native
  }
}
