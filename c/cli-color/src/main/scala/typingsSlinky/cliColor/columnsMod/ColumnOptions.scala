package typingsSlinky.cliColor.columnsMod

import typingsSlinky.cliColor.cliColorStrings.left
import typingsSlinky.cliColor.cliColorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnOptions extends js.Object {
  /**
    * align: Possible options: `'left'`, `'right'` (defaults to `'left'`)
    */
  var align: js.UndefOr[left | right] = js.native
}

object ColumnOptions {
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
  }
  
}

