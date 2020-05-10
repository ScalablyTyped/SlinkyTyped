package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint_ extends js.Object {
  /**
    * Attributes for endpoint.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * EndpointArn for mobile app and device.
    */
  var EndpointArn: js.UndefOr[String] = js.native
}

object Endpoint_ {
  @scala.inline
  def apply(): Endpoint_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint_]
  }
  @scala.inline
  implicit class Endpoint_Ops[Self <: Endpoint_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: MapStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(js.undefined)
        ret
    }
  }
  
}

