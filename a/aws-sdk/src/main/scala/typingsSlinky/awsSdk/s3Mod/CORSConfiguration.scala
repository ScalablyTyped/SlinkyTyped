package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSConfiguration extends js.Object {
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: typingsSlinky.awsSdk.s3Mod.CORSRules = js.native
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: CORSRules): CORSConfiguration = {
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
    def withCORSRules(value: CORSRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CORSRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

