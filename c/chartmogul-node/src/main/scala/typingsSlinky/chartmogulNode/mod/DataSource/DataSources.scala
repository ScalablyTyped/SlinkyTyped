package typingsSlinky.chartmogulNode.mod.DataSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSources extends js.Object {
  var data_sources: js.Array[typingsSlinky.chartmogulNode.mod.DataSource.DataSource] = js.native
}

object DataSources {
  @scala.inline
  def apply(data_sources: js.Array[typingsSlinky.chartmogulNode.mod.DataSource.DataSource]): DataSources = {
    val __obj = js.Dynamic.literal(data_sources = data_sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSources]
  }
  @scala.inline
  implicit class DataSourcesOps[Self <: DataSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData_sources(value: js.Array[typingsSlinky.chartmogulNode.mod.DataSource.DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

