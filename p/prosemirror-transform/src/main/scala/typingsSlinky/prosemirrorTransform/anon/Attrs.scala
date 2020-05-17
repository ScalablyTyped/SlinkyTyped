package typingsSlinky.prosemirrorTransform.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs[S /* <: Schema[_, _] */] extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var `type`: NodeType[S] = js.native
}

object Attrs {
  @scala.inline
  def apply[S](`type`: NodeType[S]): Attrs[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs[S]]
  }
  @scala.inline
  implicit class AttrsOps[Self[s] <: Attrs[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withType(value: NodeType[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: StringDictionary[js.Any]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(null)
        ret
    }
  }
  
}

