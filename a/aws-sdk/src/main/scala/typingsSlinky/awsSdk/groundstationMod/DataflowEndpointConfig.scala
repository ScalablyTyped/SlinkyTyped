package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointConfig extends js.Object {
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String = js.native
  /**
    * Region of a dataflow endpoint.
    */
  var dataflowEndpointRegion: js.UndefOr[String] = js.native
}

object DataflowEndpointConfig {
  @scala.inline
  def apply(dataflowEndpointName: String): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
  @scala.inline
  implicit class DataflowEndpointConfigOps[Self <: DataflowEndpointConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataflowEndpointName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataflowEndpointRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEndpointRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEndpointRegion")(js.undefined)
        ret
    }
  }
  
}

