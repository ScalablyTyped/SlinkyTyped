package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClientBigquery.anon.CreationTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[String] = js.native
  /** The type of list. */
  var kind: js.UndefOr[String] = js.native
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Tables in the requested dataset. */
  var tables: js.UndefOr[js.Array[CreationTime]] = js.native
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[Double] = js.native
}

object TableList {
  @scala.inline
  def apply(): TableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableList]
  }
  @scala.inline
  implicit class TableListOps[Self <: TableList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withTables(value: js.Array[CreationTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

