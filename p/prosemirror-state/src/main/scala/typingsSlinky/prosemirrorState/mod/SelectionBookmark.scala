package typingsSlinky.prosemirrorState.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorTransform.mod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionBookmark[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Map the bookmark through a set of changes.
    */
  def map(mapping: Mapping): SelectionBookmark[S] = js.native
  /**
    * Resolve the bookmark to a real selection again. This may need to
    * do some error checking and may fall back to a default (usually
    * [`TextSelection.between`](#state.TextSelection^between)) if
    * mapping made the bookmark invalid.
    */
  def resolve(doc: Node[S]): Selection[S] = js.native
}

object SelectionBookmark {
  @scala.inline
  def apply[S](map: Mapping => SelectionBookmark[S], resolve: Node[S] => Selection[S]): SelectionBookmark[S] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[SelectionBookmark[S]]
  }
  @scala.inline
  implicit class SelectionBookmarkOps[Self[s] <: SelectionBookmark[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withMap(value: Mapping => SelectionBookmark[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: Node[S] => Selection[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

