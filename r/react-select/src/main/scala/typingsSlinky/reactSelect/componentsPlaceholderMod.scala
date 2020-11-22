package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSelect.anon.Style
import typingsSlinky.reactSelect.typesMod.CommonProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/components/Placeholder", JSImport.Namespace)
@js.native
object componentsPlaceholderMod extends js.Object {
  
  val Placeholder: ReactComponentClass[PlaceholderProps[js.Any]] = js.native
  
  val default: ReactComponentClass[PlaceholderProps[js.Any]] = js.native
  
  def placeholderCSS(): CSSProperties = js.native
  
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */] extends CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactElement = js.native
    
    var innerProps: Style = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
}
