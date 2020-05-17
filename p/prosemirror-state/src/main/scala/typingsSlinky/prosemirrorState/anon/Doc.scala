package typingsSlinky.prosemirrorState.anon

import typingsSlinky.prosemirrorModel.mod.Mark
import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorState.mod.Plugin
import typingsSlinky.prosemirrorState.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doc[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var doc: js.UndefOr[Node[S] | Null] = js.native
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
  var schema: js.UndefOr[S | Null] = js.native
  var selection: js.UndefOr[Selection[S] | Null] = js.native
  var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
}

object Doc {
  @scala.inline
  def apply[S](): Doc[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Doc[S]]
  }
  @scala.inline
  implicit class DocOps[Self[s] <: Doc[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withDoc(value: Node[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
    @scala.inline
    def withDocNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(null)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin[_, S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(null)
        ret
    }
    @scala.inline
    def withSchema(value: S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(null)
        ret
    }
    @scala.inline
    def withSelection(value: Selection[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(null)
        ret
    }
    @scala.inline
    def withStoredMarks(value: js.Array[Mark[_]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredMarks: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedMarks")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredMarksNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedMarks")(null)
        ret
    }
  }
  
}

