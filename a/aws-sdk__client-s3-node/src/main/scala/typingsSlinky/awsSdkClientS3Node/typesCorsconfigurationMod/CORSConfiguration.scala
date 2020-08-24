package typingsSlinky.awsSdkClientS3Node.typesCorsconfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesCorsruleMod.CORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSConfiguration extends js.Object {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule] = js.native
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule]): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSConfiguration]
  }
  @scala.inline
  implicit class CORSConfigurationOps[Self <: CORSConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCORSRulesVarargs(value: CORSRule*): Self = this.set("CORSRules", js.Array(value :_*))
    @scala.inline
    def setCORSRulesIterable(value: js.Iterable[CORSRule]): Self = this.set("CORSRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setCORSRules(value: js.Array[CORSRule] | js.Iterable[CORSRule]): Self = this.set("CORSRules", value.asInstanceOf[js.Any])
  }
  
}

