package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesRequest extends js.Object {
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * A JSON-formatted list of service codes available for AWS services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.native
}

object DescribeServicesRequest {
  @scala.inline
  def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  @scala.inline
  implicit class DescribeServicesRequestOps[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCodeList(value: ServiceCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCodeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCodeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCodeList")(js.undefined)
        ret
    }
  }
  
}

