package typingsSlinky.muiDatatables.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mui-datatables", "debounceSearchRender")
@js.native
object debounceSearchRender extends js.Object {
  
  def apply(): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Function1[/* text */ String, Unit], 
      /* hideSearch */ js.Function0[Unit], 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
  def apply(debounceWait: Double): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Function1[/* text */ String, Unit], 
      /* hideSearch */ js.Function0[Unit], 
      /* options */ js.Any, 
      ReactComponentClass[js.Object] | ReactElement
    ]
  ] = js.native
}
