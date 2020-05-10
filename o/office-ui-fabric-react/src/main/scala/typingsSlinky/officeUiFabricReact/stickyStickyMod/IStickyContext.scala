package typingsSlinky.officeUiFabricReact.stickyStickyMod

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyContext extends js.Object {
  var scrollablePane: Requireable[js.Object] = js.native
}

object IStickyContext {
  @scala.inline
  def apply(scrollablePane: Requireable[js.Object]): IStickyContext = {
    val __obj = js.Dynamic.literal(scrollablePane = scrollablePane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyContext]
  }
  @scala.inline
  implicit class IStickyContextOps[Self <: IStickyContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollablePane(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollablePane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

