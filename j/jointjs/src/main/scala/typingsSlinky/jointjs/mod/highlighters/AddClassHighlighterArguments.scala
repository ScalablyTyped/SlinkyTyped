package typingsSlinky.jointjs.mod.highlighters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddClassHighlighterArguments extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object AddClassHighlighterArguments {
  @scala.inline
  def apply(): AddClassHighlighterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddClassHighlighterArguments]
  }
  @scala.inline
  implicit class AddClassHighlighterArgumentsOps[Self <: AddClassHighlighterArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

