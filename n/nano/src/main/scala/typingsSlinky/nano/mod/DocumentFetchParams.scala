package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFetchParams extends js.Object {
  var conflicts: js.UndefOr[Boolean] = js.native
  var descending: js.UndefOr[Boolean] = js.native
  var end_key: js.UndefOr[String] = js.native
  var end_key_doc_id: js.UndefOr[String] = js.native
  var inclusive_end: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var keys: js.UndefOr[String] = js.native
   // This can be string[] too ???
  var limit: js.UndefOr[Double] = js.native
  var skip: js.UndefOr[Double] = js.native
  var stale: js.UndefOr[String] = js.native
  var start_key: js.UndefOr[String] = js.native
  var start_key_doc_id: js.UndefOr[String] = js.native
  var update_seq: js.UndefOr[Boolean] = js.native
}

object DocumentFetchParams {
  @scala.inline
  def apply(): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFetchParams]
  }
  @scala.inline
  implicit class DocumentFetchParamsOps[Self <: DocumentFetchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnd_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_key_doc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key_doc_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_key_doc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_key_doc_id")(js.undefined)
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
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
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
    def withStale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_key_doc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key_doc_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_key_doc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_key_doc_id")(js.undefined)
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

