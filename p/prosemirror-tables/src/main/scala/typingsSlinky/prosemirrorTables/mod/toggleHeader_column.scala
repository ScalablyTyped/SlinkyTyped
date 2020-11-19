package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorTables.anon.UseDeprecatedLogic
import typingsSlinky.prosemirrorTables.prosemirrorTablesStrings.column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "toggleHeader")
@js.native
object toggleHeader_column extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def apply[S /* <: Schema[_, _] */](`type`: column, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}
