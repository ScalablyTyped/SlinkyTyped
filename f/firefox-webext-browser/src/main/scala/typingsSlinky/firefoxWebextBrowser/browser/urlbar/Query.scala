package typingsSlinky.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar types */
/** A query performed in the urlbar. */
@js.native
trait Query extends js.Object {
  /** List of acceptable source types to return. */
  var acceptableSources: js.Array[SourceType] = js.native
  /** Whether the query's browser context is private. */
  var isPrivate: Boolean = js.native
  /** The maximum number of results shown to the user. */
  var maxResults: Double = js.native
  /** The query's search string. */
  var searchString: String = js.native
}

object Query {
  @scala.inline
  def apply(
    acceptableSources: js.Array[SourceType],
    isPrivate: Boolean,
    maxResults: Double,
    searchString: String
  ): Query = {
    val __obj = js.Dynamic.literal(acceptableSources = acceptableSources.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableSources(value: js.Array[SourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

