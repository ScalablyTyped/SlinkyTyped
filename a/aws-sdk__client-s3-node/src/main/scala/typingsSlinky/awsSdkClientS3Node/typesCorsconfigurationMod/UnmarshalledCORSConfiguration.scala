package typingsSlinky.awsSdkClientS3Node.typesCorsconfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCORSConfiguration extends CORSConfiguration {
  /**
    * _CORSRules shape
    */
  @JSName("CORSRules")
  var CORSRules_UnmarshalledCORSConfiguration: js.Array[UnmarshalledCORSRule] = js.native
}

object UnmarshalledCORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[UnmarshalledCORSRule]): UnmarshalledCORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledCORSConfigurationOps[Self <: UnmarshalledCORSConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CORSRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

