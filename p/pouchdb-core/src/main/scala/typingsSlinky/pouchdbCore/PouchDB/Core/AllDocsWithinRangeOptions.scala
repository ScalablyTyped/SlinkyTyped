package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsWithinRangeOptions extends AllDocsOptions {
  /** High end of range, or low end if `descending` is `true`. */
  var endkey: DocumentKey = js.native
  /**
    * Include any documents identified by `endkey`.
    *
    * Defaults to `true`.
    */
  var inclusive_end: js.UndefOr[Boolean] = js.native
  /** Low end of range, or high end if `descending` is `true`. */
  var startkey: DocumentKey = js.native
}

object AllDocsWithinRangeOptions {
  @scala.inline
  def apply(endkey: DocumentKey, startkey: DocumentKey): AllDocsWithinRangeOptions = {
    val __obj = js.Dynamic.literal(endkey = endkey.asInstanceOf[js.Any], startkey = startkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithinRangeOptions]
  }
  @scala.inline
  implicit class AllDocsWithinRangeOptionsOps[Self <: AllDocsWithinRangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndkey(value: DocumentKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartkey(value: DocumentKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusive_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(js.undefined)
        ret
    }
  }
  
}

