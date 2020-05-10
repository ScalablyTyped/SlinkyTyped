package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.indices
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.node
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesStats extends Generic {
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.native
  var fielddata_fields: js.UndefOr[String | js.Array[String]] = js.native
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  var groups: js.UndefOr[Boolean] = js.native
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.native
  var index_metric: js.UndefOr[String | js.Array[String]] = js.native
  var level: js.UndefOr[indices | node | shards] = js.native
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  var timeout: js.UndefOr[String] = js.native
  var types: js.UndefOr[String | js.Array[String]] = js.native
}

object NodesStats {
  @scala.inline
  def apply(): NodesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStats]
  }
  @scala.inline
  implicit class NodesStatsOps[Self <: NodesStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletion_fields(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletion_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFielddata_fields(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fielddata_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFielddata_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fielddata_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_segment_file_sizes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_segment_file_sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_segment_file_sizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_segment_file_sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex_metric(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex_metric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_metric")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: indices | node | shards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
    @scala.inline
    def withNode_id(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

