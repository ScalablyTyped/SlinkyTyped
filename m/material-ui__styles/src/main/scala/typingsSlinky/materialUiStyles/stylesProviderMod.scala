package typingsSlinky.materialUiStyles

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesProviderMod extends Shortcut {
  
  @JSImport("@material-ui/styles/StylesProvider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StylesProviderProps] = js.native
  
  @JSImport("@material-ui/styles/StylesProvider", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  type _To = ReactComponentClass[StylesProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `stylesProviderMod.foo` */
  override def _to: ReactComponentClass[StylesProviderProps] = default
}
