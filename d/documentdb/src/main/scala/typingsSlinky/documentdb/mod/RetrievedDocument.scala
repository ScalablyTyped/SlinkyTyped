package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.documentdb.mod.UniqueId because Already inherited
- typingsSlinky.documentdb.mod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ @js.native
trait RetrievedDocument extends NewDocument {
  var _attachments: js.UndefOr[String] = js.native
  var _etag: js.UndefOr[String] = js.native
  var _rid: js.UndefOr[String] = js.native
  /** The self link. */
  var _self: String = js.native
  /** The time the object was created. */
  var _ts: Double = js.native
}

object RetrievedDocument {
  @scala.inline
  def apply(_self: String, _ts: Double, id: String): RetrievedDocument = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievedDocument]
  }
  @scala.inline
  implicit class RetrievedDocumentOps[Self <: RetrievedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_self(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attachments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_attachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachments")(js.undefined)
        ret
    }
    @scala.inline
    def with_etag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_etag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_etag")(js.undefined)
        ret
    }
    @scala.inline
    def with_rid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rid")(js.undefined)
        ret
    }
  }
  
}

