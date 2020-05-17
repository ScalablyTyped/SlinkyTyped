package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkGetOptions extends Options {
  var attachments: js.UndefOr[Boolean] = js.native
  var binary: js.UndefOr[Boolean] = js.native
  var docs: js.Array[Rev] = js.native
  var revs: js.UndefOr[Boolean] = js.native
}

object BulkGetOptions {
  @scala.inline
  def apply(docs: js.Array[Rev]): BulkGetOptions = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetOptions]
  }
  @scala.inline
  implicit class BulkGetOptionsOps[Self <: BulkGetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocs(value: js.Array[Rev]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withRevs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(js.undefined)
        ret
    }
  }
  
}

