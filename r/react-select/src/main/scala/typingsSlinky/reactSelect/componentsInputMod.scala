package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/components/Input", JSImport.Namespace)
@js.native
object componentsInputMod extends js.Object {
  
  val Input: ReactComponentClass[InputProps] = js.native
  
  val default: ReactComponentClass[InputProps] = js.native
  
  def inputCSS(props: InputProps): CSSProperties = js.native
  
  def inputStyle(isHidden: Boolean): CSSProperties = js.native
  
  /* Inlined react-select.react-select/src/types.PropsWithStyles & {cx (a : string | null, b : react-select.react-select/src/types.ClassNamesState, c : string): string | void, innerRef (element : react.react.Ref<any>): void,   isHidden :boolean,   isDisabled :boolean | undefined,   className :string | undefined} */
  @js.native
  trait InputProps extends js.Object {
    
    var className: js.UndefOr[String] = js.native
    
    def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    /** Reference to the internal element */
    def innerRef(element: Ref[_]): Unit = js.native
    
    /** Whether the input is disabled */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /** Set whether the input should be visible. Does not affect input size. */
    var isHidden: Boolean = js.native
    
    var theme: Theme = js.native
  }
}
