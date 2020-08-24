package typingsSlinky.muiDatatables.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mui-datatables", "debounceSearchRender")
@js.native
object debounceSearchRender extends js.Object {
  def apply(): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
  def apply(debounceWait: Double): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
}

