package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTerminologyRequest extends js.Object {
  /**
    * The name of the custom terminology being retrieved.
    */
  var Name: ResourceName = js.native
  /**
    * The data format of the custom terminology being retrieved, either CSV or TMX.
    */
  var TerminologyDataFormat: typingsSlinky.awsSdk.translateMod.TerminologyDataFormat = js.native
}

object GetTerminologyRequest {
  @scala.inline
  def apply(Name: ResourceName, TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TerminologyDataFormat = TerminologyDataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTerminologyRequest]
  }
  @scala.inline
  implicit class GetTerminologyRequestOps[Self <: GetTerminologyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminologyDataFormat(value: TerminologyDataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyDataFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

