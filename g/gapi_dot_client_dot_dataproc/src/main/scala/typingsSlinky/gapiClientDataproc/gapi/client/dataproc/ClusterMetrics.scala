package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMetrics extends js.Object {
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[Record[String, String]] = js.native
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[Record[String, String]] = js.native
}

object ClusterMetrics {
  @scala.inline
  def apply(): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetrics]
  }
  @scala.inline
  implicit class ClusterMetricsOps[Self <: ClusterMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHdfsMetrics(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdfsMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHdfsMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdfsMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withYarnMetrics(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarnMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYarnMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarnMetrics")(js.undefined)
        ret
    }
  }
  
}

