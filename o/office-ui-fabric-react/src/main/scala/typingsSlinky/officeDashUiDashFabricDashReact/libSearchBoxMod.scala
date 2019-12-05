package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.clearButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disableAnimation
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SearchBox", JSImport.Namespace)
@js.native
object libSearchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSearchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: ReactComponentClass[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
  }
  
}

