package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typingsSlinky.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SearchBox", JSImport.Namespace)
@js.native
object searchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typingsSlinky.officeUiFabricReact.searchBoxBaseMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: ReactComponentClass[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: PickISearchBoxPropsdisabl = js.native
  }
  
}

