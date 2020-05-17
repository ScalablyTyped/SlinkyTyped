package typingsSlinky.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doc extends js.Object {
  var changed: To | Null = js.native
  var doc: typingsSlinky.codemirror.mod.Doc = js.native
  var name: String = js.native
}

object Doc {
  @scala.inline
  def apply(doc: typingsSlinky.codemirror.mod.Doc, name: String): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  @scala.inline
  implicit class DocOps[Self <: Doc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: typingsSlinky.codemirror.mod.Doc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanged(value: To): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(null)
        ret
    }
  }
  
}

