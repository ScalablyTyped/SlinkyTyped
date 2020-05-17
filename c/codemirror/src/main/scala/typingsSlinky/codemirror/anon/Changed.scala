package typingsSlinky.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changed extends js.Object {
  var changed: js.UndefOr[FromTo] = js.native
  var doc: typingsSlinky.codemirror.mod.Doc = js.native
  var name: String = js.native
}

object Changed {
  @scala.inline
  def apply(doc: typingsSlinky.codemirror.mod.Doc, name: String): Changed = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  @scala.inline
  implicit class ChangedOps[Self <: Changed] (val x: Self) extends AnyVal {
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
    def withChanged(value: FromTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.undefined)
        ret
    }
  }
  
}

