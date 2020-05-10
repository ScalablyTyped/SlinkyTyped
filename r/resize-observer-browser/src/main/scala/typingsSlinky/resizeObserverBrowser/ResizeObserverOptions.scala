package typingsSlinky.resizeObserverBrowser

import typingsSlinky.resizeObserverBrowser.resizeObserverBrowserStrings.`border-box`
import typingsSlinky.resizeObserverBrowser.resizeObserverBrowserStrings.`content-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverOptions extends js.Object {
  /**
    * Sets which box model the observer will observe changes to. Possible values
    * are `content-box` (the default), and `border-box`.
    *
    * @default 'content-box'
    */
  var box: js.UndefOr[`content-box` | `border-box`] = js.native
}

object ResizeObserverOptions {
  @scala.inline
  def apply(): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverOptions]
  }
  @scala.inline
  implicit class ResizeObserverOptionsOps[Self <: ResizeObserverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBox(value: `content-box` | `border-box`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
  }
  
}

