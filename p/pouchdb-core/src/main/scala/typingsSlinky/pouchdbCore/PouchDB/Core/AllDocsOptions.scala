package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsOptions extends Options {
  /**
    * Include attachment data for each document.
    *
    * Requires `include_docs` to be `true`.
    *
    * By default, attachments are Base64-encoded.
    * @see binary
    */
  var attachments: js.UndefOr[Boolean] = js.native
  /**
    * Return attachments as Buffers.
    *
    * Requires `include_docs` to be `true`.
    * Requires `attachments` to be `true`.
    */
  var binary: js.UndefOr[Boolean] = js.native
  /**
    * Include conflict information for each document.
    *
    * Requires `include_docs` to be `true`.
    */
  var conflicts: js.UndefOr[Boolean] = js.native
  /** Reverse ordering of results. */
  var descending: js.UndefOr[Boolean] = js.native
  /** Include contents for each document. */
  var include_docs: js.UndefOr[Boolean] = js.native
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Number of documents to skip before returning.
    *
    * Causes poor performance on IndexedDB and LevelDB.
    */
  var skip: js.UndefOr[Double] = js.native
  /**
    * Include an update_seq value indicating which sequence id
    * of the underlying database the view reflects.
    */
  var update_seq: js.UndefOr[Boolean] = js.native
}

object AllDocsOptions {
  @scala.inline
  def apply(): AllDocsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDocsOptions]
  }
  @scala.inline
  implicit class AllDocsOptionsOps[Self <: AllDocsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConflicts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_seq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_seq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(js.undefined)
        ret
    }
  }
  
}

