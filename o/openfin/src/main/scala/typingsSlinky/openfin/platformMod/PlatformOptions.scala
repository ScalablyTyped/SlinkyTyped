package typingsSlinky.openfin.platformMod

import typingsSlinky.openfin.applicationOptionMod.ApplicationOption
import typingsSlinky.openfin.viewViewMod.ViewCreationOptions
import typingsSlinky.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformOptions extends ApplicationOption {
  var defaultViewOptions: js.UndefOr[ViewCreationOptions] = js.native
  var defaultWindowOptions: js.UndefOr[WindowOption] = js.native
}

object PlatformOptions {
  @scala.inline
  def apply(uuid: String): PlatformOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
  @scala.inline
  implicit class PlatformOptionsOps[Self <: PlatformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultViewOptions(value: ViewCreationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWindowOptions(value: WindowOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWindowOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWindowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWindowOptions")(js.undefined)
        ret
    }
  }
  
}

