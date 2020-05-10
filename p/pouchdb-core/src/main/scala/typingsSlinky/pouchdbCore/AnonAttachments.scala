package typingsSlinky.pouchdbCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pouchdbCore.PouchDB.Core.Attachments
import typingsSlinky.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachments extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.native
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.native
  var filters: js.UndefOr[StringDictionary[String]] = js.native
  var views: js.UndefOr[StringDictionary[AnonMap]] = js.native
}

object AnonAttachments {
  @scala.inline
  def apply(): AnonAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAttachments]
  }
  @scala.inline
  implicit class AnonAttachmentsOps[Self <: AnonAttachments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attachments(value: Attachments): Self = {
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
    def with_rev(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: StringDictionary[AnonMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

