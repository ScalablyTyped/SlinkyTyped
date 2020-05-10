package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Named[Name /* <: String */] extends js.Object {
  var name: js.UndefOr[Name] = js.native
}

object Named {
  @scala.inline
  def apply[Name](): Named[Name] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Named[Name]]
  }
  @scala.inline
  implicit class NamedOps[Self[name] <: Named[name], Name] (val x: Self[Name]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Name] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Name] with Other]
    @scala.inline
    def withName(value: Name): Self[Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

