package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKEVersionsRequestListValue extends js.Object {
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.native
}

object IKEVersionsRequestListValue {
  @scala.inline
  def apply(): IKEVersionsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKEVersionsRequestListValue]
  }
  @scala.inline
  implicit class IKEVersionsRequestListValueOps[Self <: IKEVersionsRequestListValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

