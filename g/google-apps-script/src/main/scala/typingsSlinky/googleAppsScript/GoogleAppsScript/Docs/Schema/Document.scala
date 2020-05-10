package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var body: js.UndefOr[Body] = js.native
  var documentId: js.UndefOr[String] = js.native
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  var footers: js.UndefOr[js.Object] = js.native
  var footnotes: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var inlineObjects: js.UndefOr[js.Object] = js.native
  var lists: js.UndefOr[js.Object] = js.native
  var namedRanges: js.UndefOr[js.Object] = js.native
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  var positionedObjects: js.UndefOr[js.Object] = js.native
  var revisionId: js.UndefOr[String] = js.native
  var suggestedDocumentStyleChanges: js.UndefOr[js.Object] = js.native
  var suggestedNamedStylesChanges: js.UndefOr[js.Object] = js.native
  var suggestionsViewMode: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentStyle(value: DocumentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footers")(js.undefined)
        ret
    }
    @scala.inline
    def withFootnotes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFootnotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnotes")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineObjects(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withLists(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedStyles(value: NamedStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionedObjects(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDocumentStyleChanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDocumentStyleChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDocumentStyleChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDocumentStyleChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedNamedStylesChanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedNamedStylesChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedNamedStylesChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedNamedStylesChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsViewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsViewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

