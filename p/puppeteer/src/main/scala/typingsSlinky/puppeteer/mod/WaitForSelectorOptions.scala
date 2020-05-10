package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitForSelectorOptions extends Timeoutable {
  /**
    * Wait for element to not be found in the DOM or to be hidden,
    * i.e. have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Wait for element to be present in DOM and to be visible,
    * i.e. to not have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object WaitForSelectorOptions {
  @scala.inline
  def apply(): WaitForSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForSelectorOptions]
  }
  @scala.inline
  implicit class WaitForSelectorOptionsOps[Self <: WaitForSelectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

