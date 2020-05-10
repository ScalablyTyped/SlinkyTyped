package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOptions extends Timeoutable {
  /**
    * When to consider navigation succeeded.
    * @default load Navigation is consider when the `load` event is fired.
    */
  var waitUntil: js.UndefOr[LoadEvent | js.Array[LoadEvent]] = js.native
}

object NavigationOptions {
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWaitUntil(value: LoadEvent | js.Array[LoadEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitUntil")(js.undefined)
        ret
    }
  }
  
}

