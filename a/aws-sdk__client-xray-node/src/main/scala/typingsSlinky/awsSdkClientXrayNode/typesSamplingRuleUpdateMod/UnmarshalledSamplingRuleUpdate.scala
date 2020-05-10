package typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingRuleUpdate extends SamplingRuleUpdate {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledSamplingRuleUpdate: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledSamplingRuleUpdate {
  @scala.inline
  def apply(): UnmarshalledSamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingRuleUpdate]
  }
  @scala.inline
  implicit class UnmarshalledSamplingRuleUpdateOps[Self <: UnmarshalledSamplingRuleUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[String]): Self = {
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
  }
  
}

