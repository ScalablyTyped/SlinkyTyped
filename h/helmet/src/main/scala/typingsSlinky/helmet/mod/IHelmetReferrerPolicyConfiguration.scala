package typingsSlinky.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetReferrerPolicyConfiguration extends js.Object {
  var policy: js.UndefOr[String | js.Array[String]] = js.native
}

object IHelmetReferrerPolicyConfiguration {
  @scala.inline
  def apply(): IHelmetReferrerPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetReferrerPolicyConfiguration]
  }
  @scala.inline
  implicit class IHelmetReferrerPolicyConfigurationOps[Self <: IHelmetReferrerPolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

