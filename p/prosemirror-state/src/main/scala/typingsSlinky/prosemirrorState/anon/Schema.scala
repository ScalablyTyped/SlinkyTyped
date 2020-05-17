package typingsSlinky.prosemirrorState.anon

import typingsSlinky.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
  var schema: S = js.native
}

object Schema {
  @scala.inline
  def apply[S](schema: S): Schema[S] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[S]]
  }
  @scala.inline
  implicit class SchemaOps[Self[s] <: Schema[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withSchema(value: S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
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
  }
  
}

