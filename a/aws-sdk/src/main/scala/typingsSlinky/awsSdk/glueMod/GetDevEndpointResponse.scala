package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointResponse extends js.Object {
  /**
    * A DevEndpoint definition.
    */
  var DevEndpoint: js.UndefOr[typingsSlinky.awsSdk.glueMod.DevEndpoint] = js.native
}

object GetDevEndpointResponse {
  @scala.inline
  def apply(): GetDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointResponse]
  }
  @scala.inline
  implicit class GetDevEndpointResponseOps[Self <: GetDevEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevEndpoint(value: DevEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoint")(js.undefined)
        ret
    }
  }
  
}

