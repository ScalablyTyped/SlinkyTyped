package typingsSlinky.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[String] = js.native
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * @default 'page'
    */
  var page: js.UndefOr[String] = js.native
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[String] = js.native
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[String] = js.native
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[String] = js.native
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.native
  /**
    * @default 'records'
    */
  var records: js.UndefOr[String] = js.native
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[String] = js.native
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynatable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynatable")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPage")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryRecordCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryRecordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
    @scala.inline
    def withSorts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorts")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecordCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordCount")(js.undefined)
        ret
    }
  }
  
}

