package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageCloseOptions extends js.Object {
  /**
    * Whether to run the before unload page handlers.
    * @default false
    */
  var runBeforeUnload: js.UndefOr[Boolean] = js.native
}

object PageCloseOptions {
  @scala.inline
  def apply(): PageCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCloseOptions]
  }
  @scala.inline
  implicit class PageCloseOptionsOps[Self <: PageCloseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunBeforeUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBeforeUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunBeforeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBeforeUnload")(js.undefined)
        ret
    }
  }
  
}

