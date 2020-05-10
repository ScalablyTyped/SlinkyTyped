package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceNote extends js.Object {
  /** The role of the person (buyer/seller) creating the note. (readonly) */
  var creatorRole: js.UndefOr[String] = js.native
  /** Notes can optionally be associated with a deal. (readonly, except on create) */
  var dealId: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote". */
  var kind: js.UndefOr[String] = js.native
  /** The actual note to attach. (readonly, except on create) */
  var note: js.UndefOr[String] = js.native
  /** The unique id for the note. (readonly) */
  var noteId: js.UndefOr[String] = js.native
  /** The proposalId that a note is attached to. (readonly) */
  var proposalId: js.UndefOr[String] = js.native
  /** If the note is associated with a proposal revision number, then store that here. (readonly, except on create) */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /** The timestamp (ms since epoch) that this note was created. (readonly) */
  var timestampMs: js.UndefOr[String] = js.native
}

object MarketplaceNote {
  @scala.inline
  def apply(): MarketplaceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceNote]
  }
  @scala.inline
  implicit class MarketplaceNoteOps[Self <: MarketplaceNote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatorRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(js.undefined)
        ret
    }
    @scala.inline
    def withDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMs")(js.undefined)
        ret
    }
  }
  
}

