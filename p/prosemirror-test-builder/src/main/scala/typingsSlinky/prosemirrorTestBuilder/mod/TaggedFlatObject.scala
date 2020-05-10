package typingsSlinky.prosemirrorTestBuilder.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedFlatObject[S /* <: Schema[_, _] */] extends js.Object {
  var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]] = js.native
  var tag: Record[String, Double] = js.native
}

object TaggedFlatObject {
  @scala.inline
  def apply[S](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedFlatObject[S]]
  }
  @scala.inline
  implicit class TaggedFlatObjectOps[Self[s] <: TaggedFlatObject[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withFlat(value: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Record[String, Double]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

