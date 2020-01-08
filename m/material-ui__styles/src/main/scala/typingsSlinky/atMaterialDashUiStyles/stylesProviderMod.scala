package typingsSlinky.atMaterialDashUiStyles

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/StylesProvider", JSImport.Namespace)
@js.native
object stylesProviderMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  @js.native
  object default extends TopLevel[ComponentType[StylesProviderProps]]
  
}

