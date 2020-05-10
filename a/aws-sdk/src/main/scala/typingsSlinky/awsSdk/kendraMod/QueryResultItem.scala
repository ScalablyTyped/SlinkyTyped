package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultItem extends js.Object {
  /**
    * 
    */
  var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList] = js.native
  /**
    * An array of document attributes for the document that the query result maps to. For example, the document author (Author) or the source URI (SourceUri) of the document.
    */
  var DocumentAttributes: js.UndefOr[DocumentAttributeList] = js.native
  /**
    * An extract of the text in the document. Contains information about highlighting the relevant terms in the excerpt.
    */
  var DocumentExcerpt: js.UndefOr[TextWithHighlights] = js.native
  /**
    * The unique identifier for the document.
    */
  var DocumentId: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentId] = js.native
  /**
    * The title of the document. Contains the text of the title and information for highlighting the relevant terms in the title.
    */
  var DocumentTitle: js.UndefOr[TextWithHighlights] = js.native
  /**
    * The URI of the original location of the document.
    */
  var DocumentURI: js.UndefOr[Url] = js.native
  /**
    * The unique identifier for the query result.
    */
  var Id: js.UndefOr[ResultId] = js.native
  /**
    * The type of document. 
    */
  var Type: js.UndefOr[QueryResultType] = js.native
}

object QueryResultItem {
  @scala.inline
  def apply(): QueryResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResultItem]
  }
  @scala.inline
  implicit class QueryResultItemOps[Self <: QueryResultItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalAttributes(value: AdditionalResultAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentAttributes(value: DocumentAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentExcerpt(value: TextWithHighlights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentExcerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentExcerpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentExcerpt")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentId(value: DocumentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentTitle(value: TextWithHighlights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentURI(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentURI")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResultId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: QueryResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

