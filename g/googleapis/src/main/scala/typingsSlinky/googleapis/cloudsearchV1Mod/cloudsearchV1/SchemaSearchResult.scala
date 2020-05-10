package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results containing indexed information for a document.
  */
@js.native
trait SchemaSearchResult extends js.Object {
  /**
    * If source is clustered, provide list of clustered results. There will
    * only be one level of clustered results. If current source is not enabled
    * for clustering, this field will be empty.
    */
  var clusteredResults: js.UndefOr[js.Array[SchemaSearchResult]] = js.native
  /**
    * Debugging information about this search result.
    */
  var debugInfo: js.UndefOr[SchemaResultDebugInfo] = js.native
  /**
    * Metadata of the search result.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * The concatenation of all snippets (summaries) available for this result.
    */
  var snippet: js.UndefOr[SchemaSnippet] = js.native
  /**
    * Title of the search result.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The URL of the search result. The URL contains a Google redirect to the
    * actual item.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSearchResult {
  @scala.inline
  def apply(): SchemaSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResult]
  }
  @scala.inline
  implicit class SchemaSearchResultOps[Self <: SchemaSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusteredResults(value: js.Array[SchemaSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteredResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusteredResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteredResults")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugInfo(value: SchemaResultDebugInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: SchemaSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
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
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

