package typingsSlinky.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetHidePoweredByConfiguration extends js.Object {
  var setTo: js.UndefOr[String] = js.native
}

object IHelmetHidePoweredByConfiguration {
  @scala.inline
  def apply(): IHelmetHidePoweredByConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetHidePoweredByConfiguration]
  }
  @scala.inline
  implicit class IHelmetHidePoweredByConfigurationOps[Self <: IHelmetHidePoweredByConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTo")(js.undefined)
        ret
    }
  }
  
}

