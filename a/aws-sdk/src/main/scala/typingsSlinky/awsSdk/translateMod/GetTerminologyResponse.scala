package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTerminologyResponse extends js.Object {
  /**
    * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
    */
  var TerminologyDataLocation: js.UndefOr[typingsSlinky.awsSdk.translateMod.TerminologyDataLocation] = js.native
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typingsSlinky.awsSdk.translateMod.TerminologyProperties] = js.native
}

object GetTerminologyResponse {
  @scala.inline
  def apply(): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTerminologyResponse]
  }
  @scala.inline
  implicit class GetTerminologyResponseOps[Self <: GetTerminologyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminologyDataLocation(value: TerminologyDataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyDataLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminologyDataLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyDataLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminologyProperties(value: TerminologyProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminologyProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyProperties")(js.undefined)
        ret
    }
  }
  
}

