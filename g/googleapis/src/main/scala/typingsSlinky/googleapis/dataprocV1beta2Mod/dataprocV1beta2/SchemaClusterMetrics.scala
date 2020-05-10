package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains cluster daemon metrics, such as HDFS and YARN stats.Beta Feature:
  * This report is available for testing purposes only. It may be changed
  * before final release.
  */
@js.native
trait SchemaClusterMetrics extends js.Object {
  /**
    * The HDFS metrics.
    */
  var hdfsMetrics: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The YARN metrics.
    */
  var yarnMetrics: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaClusterMetrics {
  @scala.inline
  def apply(): SchemaClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterMetrics]
  }
  @scala.inline
  implicit class SchemaClusterMetricsOps[Self <: SchemaClusterMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHdfsMetrics(value: StringDictionary[String]): Self = {
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
    def withYarnMetrics(value: StringDictionary[String]): Self = {
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

