package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Docs document.
  */
@js.native
trait SchemaDocument extends js.Object {
  /**
    * The main body of the document.
    */
  var body: js.UndefOr[SchemaBody] = js.native
  /**
    * The ID of the document.
    */
  var documentId: js.UndefOr[String] = js.native
  /**
    * The style of the document.
    */
  var documentStyle: js.UndefOr[SchemaDocumentStyle] = js.native
  /**
    * The footers in the document, keyed by footer ID.
    */
  var footers: js.UndefOr[StringDictionary[SchemaFooter]] = js.native
  /**
    * The footnotes in the document, keyed by footnote ID.
    */
  var footnotes: js.UndefOr[StringDictionary[SchemaFootnote]] = js.native
  /**
    * The headers in the document, keyed by header ID.
    */
  var headers: js.UndefOr[StringDictionary[SchemaHeader]] = js.native
  /**
    * The inline objects in the document, keyed by object ID.
    */
  var inlineObjects: js.UndefOr[StringDictionary[SchemaInlineObject]] = js.native
  /**
    * The lists in the document, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList]] = js.native
  /**
    * The named ranges in the document, keyed by name.
    */
  var namedRanges: js.UndefOr[StringDictionary[SchemaNamedRanges]] = js.native
  /**
    * The named styles of the document.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.native
  /**
    * The positioned objects in the document, keyed by object ID.
    */
  var positionedObjects: js.UndefOr[StringDictionary[SchemaPositionedObject]] = js.native
  /**
    * The revision ID of the document. Can be used in update requests to
    * specify which revision of a document to apply updates to and how the
    * request should behave if the document has been edited since that
    * revision. Only populated if the user has edit access to the document. The
    * format of the revision ID may change over time, so it should be treated
    * opaquely. A returned revision ID is only guaranteed to be valid for 24
    * hours after it has been returned and cannot be shared across users. If
    * the revision ID is unchanged between calls, then the document has not
    * changed. Conversely, a changed ID (for the same document and user)
    * usually means the document has been updated; however, a changed ID can
    * also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * The suggested changes to the style of the document, keyed by suggestion
    * ID.
    */
  var suggestedDocumentStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedDocumentStyle]] = js.native
  /**
    * The suggested changes to the named styles of the document, keyed by
    * suggestion ID.
    */
  var suggestedNamedStylesChanges: js.UndefOr[StringDictionary[SchemaSuggestedNamedStyles]] = js.native
  /**
    * The suggestions view mode applied to the document.  Note: When editing a
    * document, changes must be based on a document with SUGGESTIONS_INLINE.
    */
  var suggestionsViewMode: js.UndefOr[String] = js.native
  /**
    * The title of the document.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaDocument {
  @scala.inline
  def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  @scala.inline
  implicit class SchemaDocumentOps[Self <: SchemaDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: SchemaBody): Self = {
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
    def withDocumentStyle(value: SchemaDocumentStyle): Self = {
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
    def withFooters(value: StringDictionary[SchemaFooter]): Self = {
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
    def withFootnotes(value: StringDictionary[SchemaFootnote]): Self = {
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
    def withHeaders(value: StringDictionary[SchemaHeader]): Self = {
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
    def withInlineObjects(value: StringDictionary[SchemaInlineObject]): Self = {
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
    def withLists(value: StringDictionary[SchemaList]): Self = {
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
    def withNamedRanges(value: StringDictionary[SchemaNamedRanges]): Self = {
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
    def withNamedStyles(value: SchemaNamedStyles): Self = {
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
    def withPositionedObjects(value: StringDictionary[SchemaPositionedObject]): Self = {
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
    def withSuggestedDocumentStyleChanges(value: StringDictionary[SchemaSuggestedDocumentStyle]): Self = {
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
    def withSuggestedNamedStylesChanges(value: StringDictionary[SchemaSuggestedNamedStyles]): Self = {
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

