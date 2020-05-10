package typingsSlinky.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options affecting how the information is returned.
  * @since Chrome 59
  */
@js.native
trait DisplayInfoFlags extends js.Object {
  /**
    * If set to true, only a single DisplayUnitInfo will be returned by getInfo when in unified desktop mode.
    * @see[enableUnifiedDesktop]
    * @default false
    */
  var singleUnified: js.UndefOr[Boolean] = js.native
}

object DisplayInfoFlags {
  @scala.inline
  def apply(): DisplayInfoFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayInfoFlags]
  }
  @scala.inline
  implicit class DisplayInfoFlagsOps[Self <: DisplayInfoFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSingleUnified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUnified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleUnified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUnified")(js.undefined)
        ret
    }
  }
  
}

