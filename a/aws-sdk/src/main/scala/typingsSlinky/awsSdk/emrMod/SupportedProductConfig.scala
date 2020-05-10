package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedProductConfig extends js.Object {
  /**
    * The list of user-supplied arguments.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * The name of the product configuration.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}

object SupportedProductConfig {
  @scala.inline
  def apply(): SupportedProductConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedProductConfig]
  }
  @scala.inline
  implicit class SupportedProductConfigOps[Self <: SupportedProductConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: XmlStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

