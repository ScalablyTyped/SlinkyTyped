package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.mutation
import typingsSlinky.puppeteer.puppeteerStrings.raf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageFnOptions extends Timeoutable {
  var polling: js.UndefOr[raf | mutation | Double] = js.native
}

object PageFnOptions {
  @scala.inline
  def apply(): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFnOptions]
  }
  @scala.inline
  implicit class PageFnOptionsOps[Self <: PageFnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolling(value: raf | mutation | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(js.undefined)
        ret
    }
  }
  
}

