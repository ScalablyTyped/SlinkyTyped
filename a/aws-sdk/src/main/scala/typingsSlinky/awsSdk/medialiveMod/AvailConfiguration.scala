package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailConfiguration extends js.Object {
  /**
    * Ad avail settings.
    */
  var AvailSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AvailSettings] = js.native
}

object AvailConfiguration {
  @scala.inline
  def apply(): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailConfiguration]
  }
  @scala.inline
  implicit class AvailConfigurationOps[Self <: AvailConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailSettings(value: AvailSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailSettings")(js.undefined)
        ret
    }
  }
  
}

