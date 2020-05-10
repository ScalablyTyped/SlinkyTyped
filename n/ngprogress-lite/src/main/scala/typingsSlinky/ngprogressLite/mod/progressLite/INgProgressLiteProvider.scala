package typingsSlinky.ngprogressLite.mod.progressLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgProgressLiteProvider extends js.Object {
  var settings: IConfigurationOptions = js.native
}

object INgProgressLiteProvider {
  @scala.inline
  def apply(settings: IConfigurationOptions): INgProgressLiteProvider = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgProgressLiteProvider]
  }
  @scala.inline
  implicit class INgProgressLiteProviderOps[Self <: INgProgressLiteProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSettings(value: IConfigurationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

