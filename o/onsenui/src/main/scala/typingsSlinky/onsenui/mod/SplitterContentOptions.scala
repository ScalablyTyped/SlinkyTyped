package typingsSlinky.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterContentOptions extends js.Object {
  /**
    * @description This function will be called after the menu has been opened.
    * @return {Function}
    */
  var callback: js.UndefOr[js.Function] = js.native
}

object SplitterContentOptions {
  @scala.inline
  def apply(): SplitterContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterContentOptions]
  }
  @scala.inline
  implicit class SplitterContentOptionsOps[Self <: SplitterContentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
  }
  
}

