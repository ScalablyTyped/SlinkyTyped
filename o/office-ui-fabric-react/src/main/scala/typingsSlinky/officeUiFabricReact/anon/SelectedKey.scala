package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedKey extends js.Object {
  var selectedKey: String = js.native
}

object SelectedKey {
  @scala.inline
  def apply(selectedKey: String): SelectedKey = {
    val __obj = js.Dynamic.literal(selectedKey = selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedKey]
  }
  @scala.inline
  implicit class SelectedKeyOps[Self <: SelectedKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

