package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.green
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.high
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.immediate
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.indices
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.languid
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.low
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.normal
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.red
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.shards
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.urgent
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterHealth extends Generic {
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var level: js.UndefOr[cluster | indices | shards] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
  var wait_for_events: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.native
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.native
  var wait_for_nodes: js.UndefOr[String] = js.native
  var wait_for_status: js.UndefOr[green | yellow | red] = js.native
}

object ClusterHealth {
  @scala.inline
  def apply(): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealth]
  }
  @scala.inline
  implicit class ClusterHealthOps[Self <: ClusterHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLevel(value: cluster | indices | shards): Self = {
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
    def withWait_for_active_shards(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_active_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_active_shards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_active_shards")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_events(value: immediate | urgent | high | normal | low | languid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_events: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_events")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_no_initializing_shards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_no_initializing_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_no_initializing_shards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_no_initializing_shards")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_no_relocating_shards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_no_relocating_shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_no_relocating_shards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_no_relocating_shards")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_nodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_nodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_status(value: green | yellow | red): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_status")(js.undefined)
        ret
    }
  }
  
}

