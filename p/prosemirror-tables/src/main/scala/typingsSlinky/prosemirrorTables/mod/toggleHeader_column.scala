package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorTables.AnonUseDeprecatedLogic
import typingsSlinky.prosemirrorTables.prosemirrorTablesStrings.column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "toggleHeader")
@js.native
object toggleHeader_column extends js.Object {
  def apply[S /* <: Schema[_, _] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def apply[S /* <: Schema[_, _] */](`type`: column, options: AnonUseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

