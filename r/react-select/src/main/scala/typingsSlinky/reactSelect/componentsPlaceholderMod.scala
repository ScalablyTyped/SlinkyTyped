package typingsSlinky.reactSelect

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSelect.anon.Style
import typingsSlinky.reactSelect.typesMod.CommonProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPlaceholderMod extends Shortcut {
  
  @JSImport("react-select/src/components/Placeholder", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Placeholder", "Placeholder")
  @js.native
  val Placeholder: ReactComponentClass[PlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Placeholder", "placeholderCSS")
  @js.native
  def placeholderCSS(): CSSProperties = js.native
  
  @js.native
  trait PlaceholderProps[OptionType /* <: OptionTypeBase */] extends CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactElement = js.native
    
    var innerProps: Style = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
  
  type _To = ReactComponentClass[PlaceholderProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `componentsPlaceholderMod.foo` */
  override def _to: ReactComponentClass[PlaceholderProps[js.Any]] = default
}
