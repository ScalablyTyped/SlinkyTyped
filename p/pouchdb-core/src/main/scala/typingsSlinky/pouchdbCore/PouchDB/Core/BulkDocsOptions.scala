package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDocsOptions extends Options {
  var new_edits: js.UndefOr[Boolean] = js.native
}

object BulkDocsOptions {
  @scala.inline
  def apply(): BulkDocsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDocsOptions]
  }
  @scala.inline
  implicit class BulkDocsOptionsOps[Self <: BulkDocsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNew_edits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_edits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_edits")(js.undefined)
        ret
    }
  }
  
}

