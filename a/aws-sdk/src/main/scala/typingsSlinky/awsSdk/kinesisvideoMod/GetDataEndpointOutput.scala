package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataEndpointOutput extends js.Object {
  /**
    * The endpoint value. To read data from the stream or to write data to it, specify this endpoint in your application.
    */
  var DataEndpoint: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.DataEndpoint] = js.native
}

object GetDataEndpointOutput {
  @scala.inline
  def apply(): GetDataEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataEndpointOutput]
  }
  @scala.inline
  implicit class GetDataEndpointOutputOps[Self <: GetDataEndpointOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataEndpoint(value: DataEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataEndpoint")(js.undefined)
        ret
    }
  }
  
}

