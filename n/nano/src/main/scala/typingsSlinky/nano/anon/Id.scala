package typingsSlinky.nano.anon

import typingsSlinky.nano.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id[V, D] extends js.Object {
  var doc: js.UndefOr[D with Document] = js.native
  var id: String = js.native
  var key: String = js.native
  var value: V = js.native
}

object Id {
  @scala.inline
  def apply[V, D](id: String, key: String, value: V): Id[V, D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[V, D]]
  }
  @scala.inline
  implicit class IdOps[Self[v, d] <: Id[v, d], V, D] (val x: Self[V, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, D]) with Other]
    @scala.inline
    def withId(value: String): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: V): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: D with Document): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
  }
  
}

