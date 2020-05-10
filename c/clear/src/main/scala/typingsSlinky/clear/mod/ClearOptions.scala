package typingsSlinky.clear.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearOptions extends js.Object {
  /**
    * Setting this to false will prevent this module from clearing the screen.
    * This will not remove anything from the screen, but instead move your cursor
    * to position 0,0. Much like printing a \r instead of a \n to reset the current line of output.
    *
    * @default true
    */
  var fullClear: js.UndefOr[Boolean] = js.native
}

object ClearOptions {
  @scala.inline
  def apply(): ClearOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearOptions]
  }
  @scala.inline
  implicit class ClearOptionsOps[Self <: ClearOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullClear")(js.undefined)
        ret
    }
  }
  
}

