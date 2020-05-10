package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGeoMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * The GeoMatchSet returned in the CreateGeoMatchSet response. The GeoMatchSet contains no GeoMatchConstraints.
    */
  var GeoMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.GeoMatchSet] = js.native
}

object CreateGeoMatchSetResponse {
  @scala.inline
  def apply(): CreateGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGeoMatchSetResponse]
  }
  @scala.inline
  implicit class CreateGeoMatchSetResponseOps[Self <: CreateGeoMatchSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoMatchSet(value: GeoMatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoMatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSet")(js.undefined)
        ret
    }
  }
  
}

