package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for querying Drive activity.
  */
@js.native
trait SchemaQueryDriveActivityRequest extends js.Object {
  /**
    * Return activities for this Drive folder and all children and descendants.
    * The format is &quot;items/ITEM_ID&quot;.
    */
  var ancestorName: js.UndefOr[String] = js.native
  /**
    * Details on how to consolidate related actions that make up the activity.
    * If not set, then related actions will not be consolidated.
    */
  var consolidationStrategy: js.UndefOr[SchemaConsolidationStrategy] = js.native
  /**
    * The filtering for items returned from this query request. The format of
    * the filter string is a sequence of expressions, joined by an optional
    * &quot;AND&quot;, where each expression is of the form &quot;field
    * operator value&quot;.  Supported fields:    - &lt;tt&gt;time&lt;/tt&gt;:
    * Uses numerical operators on date values either in     terms of
    * milliseconds since Jan 1, 1970 or in RFC 3339 format.     Examples: -
    * &lt;tt&gt;time &gt; 1452409200000 AND time &lt;= 1492812924310&lt;/tt&gt;
    * - &lt;tt&gt;time &gt;= &quot;2016-01-10T01:02:03-05:00&quot;&lt;/tt&gt;
    * - &lt;tt&gt;detail.action_detail_case&lt;/tt&gt;: Uses the
    * &quot;has&quot; operator (:) and     either a singular value or a list of
    * allowed action types enclosed in     parentheses.     Examples:       -
    * &lt;tt&gt;detail.action_detail_case: RENAME&lt;/tt&gt;       -
    * &lt;tt&gt;detail.action_detail_case:(CREATE UPLOAD)&lt;/tt&gt;       -
    * &lt;tt&gt;-detail.action_detail_case:MOVE&lt;/tt&gt;
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Return activities for this Drive item. The format is
    * &quot;items/ITEM_ID&quot;.
    */
  var itemName: js.UndefOr[String] = js.native
  /**
    * The requested number of activity to return. If not set, a default value
    * will be used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous QueryDriveActivity
    * request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaQueryDriveActivityRequest {
  @scala.inline
  def apply(): SchemaQueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryDriveActivityRequest]
  }
  @scala.inline
  implicit class SchemaQueryDriveActivityRequestOps[Self <: SchemaQueryDriveActivityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorName")(js.undefined)
        ret
    }
    @scala.inline
    def withConsolidationStrategy(value: SchemaConsolidationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsolidationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

