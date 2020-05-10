package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the response for method ListSaveQuery.
  */
@js.native
trait SchemaListSavedQueriesResponse extends js.Object {
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more saved queries to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of output saved queries.
    */
  var savedQueries: js.UndefOr[js.Array[SchemaSavedQuery]] = js.native
}

object SchemaListSavedQueriesResponse {
  @scala.inline
  def apply(): SchemaListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSavedQueriesResponse]
  }
  @scala.inline
  implicit class SchemaListSavedQueriesResponseOps[Self <: SchemaListSavedQueriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedQueries(value: js.Array[SchemaSavedQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedQueries")(js.undefined)
        ret
    }
  }
  
}

