package typingsSlinky.arrayTreeFilter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenKeyName extends js.Object {
  var childrenKeyName: js.UndefOr[String] = js.native
}

object ChildrenKeyName {
  @scala.inline
  def apply(): ChildrenKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenKeyName]
  }
  @scala.inline
  implicit class ChildrenKeyNameOps[Self <: ChildrenKeyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenKeyName")(js.undefined)
        ret
    }
  }
  
}

