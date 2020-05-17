package typingsSlinky.pouchdbFind.PouchDB.Find

import typingsSlinky.pouchdbFind.anon.Ddoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexOptions extends js.Object {
  var index: Ddoc = js.native
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: Ddoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
  @scala.inline
  implicit class CreateIndexOptionsOps[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Ddoc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

