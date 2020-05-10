package typingsSlinky.materialUiStyles

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/StylesProvider", JSImport.Namespace)
@js.native
object stylesProviderMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StylesProviderProps, js.Object, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  @js.native
  object default extends TopLevel[ReactComponentClass[StylesProviderProps]]
  
}

