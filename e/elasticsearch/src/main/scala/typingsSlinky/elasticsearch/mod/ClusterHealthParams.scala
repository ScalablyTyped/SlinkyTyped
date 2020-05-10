package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.cluster
import typingsSlinky.elasticsearch.elasticsearchStrings.green
import typingsSlinky.elasticsearch.elasticsearchStrings.high
import typingsSlinky.elasticsearch.elasticsearchStrings.immediate
import typingsSlinky.elasticsearch.elasticsearchStrings.indices
import typingsSlinky.elasticsearch.elasticsearchStrings.languid
import typingsSlinky.elasticsearch.elasticsearchStrings.low
import typingsSlinky.elasticsearch.elasticsearchStrings.normal
import typingsSlinky.elasticsearch.elasticsearchStrings.red
import typingsSlinky.elasticsearch.elasticsearchStrings.shards
import typingsSlinky.elasticsearch.elasticsearchStrings.urgent
import typingsSlinky.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterHealthParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.native
  var level: js.UndefOr[cluster | indices | shards] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var waitForActiveShards: js.UndefOr[String] = js.native
  var waitForEvents: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  var waitForNodes: js.UndefOr[String] = js.native
  var waitForRelocatingShards: js.UndefOr[Boolean] = js.native
  var waitForStatus: js.UndefOr[green | yellow | red] = js.native
}

object ClusterHealthParams {
  @scala.inline
  def apply(): ClusterHealthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealthParams]
  }
  @scala.inline
  implicit class ClusterHealthParamsOps[Self <: ClusterHealthParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: NameList): Self = {
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
    def withMasterTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForActiveShards(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForActiveShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForActiveShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForActiveShards")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForEvents(value: immediate | urgent | high | normal | low | languid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForNodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForRelocatingShards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRelocatingShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForRelocatingShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForRelocatingShards")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForStatus(value: green | yellow | red): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForStatus")(js.undefined)
        ret
    }
  }
  
}

