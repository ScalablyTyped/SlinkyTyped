package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.native
  var flat_settings: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  var wait_for_metadata_version: js.UndefOr[Double] = js.native
  var wait_for_timeout: js.UndefOr[String] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_no_indices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_indices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_indices")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand_wildcards(value: open | closed | none | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_wildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand_wildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_wildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat_settings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat_settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_settings")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_unavailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_unavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_unavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster_timeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(js.undefined)
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
    def withWait_for_metadata_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_metadata_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_metadata_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_metadata_version")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_timeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_timeout")(js.undefined)
        ret
    }
  }
  
}

