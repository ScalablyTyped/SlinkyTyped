package typingsSlinky.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndOptions[Props] extends js.Object {
  var arePropsEqual: js.UndefOr[js.Function2[/* first */ Props, /* second */ Props, Boolean]] = js.native
}

object DndOptions {
  @scala.inline
  def apply[Props](): DndOptions[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DndOptions[Props]]
  }
  @scala.inline
  implicit class DndOptionsOps[Self[props] <: DndOptions[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withArePropsEqual(value: (/* first */ Props, /* second */ Props) => Boolean): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arePropsEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutArePropsEqual: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arePropsEqual")(js.undefined)
        ret
    }
  }
  
}

