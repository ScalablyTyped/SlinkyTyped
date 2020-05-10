package typingsSlinky.inputmask.mod._Global_

import typingsSlinky.inputmask.mod.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var inputmask: js.UndefOr[Instance] = js.native
}

object HTMLElement {
  @scala.inline
  def apply(): HTMLElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputmask(value: Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmask")(js.undefined)
        ret
    }
  }
  
}

