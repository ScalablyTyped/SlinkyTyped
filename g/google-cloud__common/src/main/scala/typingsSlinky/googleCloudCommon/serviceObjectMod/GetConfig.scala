package typingsSlinky.googleCloudCommon.serviceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfig extends js.Object {
  /**
    * Create the object if it doesn't already exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
}

object GetConfig {
  @scala.inline
  def apply(): GetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfig]
  }
  @scala.inline
  implicit class GetConfigOps[Self <: GetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
        ret
    }
  }
  
}

