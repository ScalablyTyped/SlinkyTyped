package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expand extends js.Object {
  var expand: js.Array[String] = js.native
  var property: String = js.native
  def onExpand(args: js.Any*): js.Any = js.native
}

object Expand {
  @scala.inline
  def apply(expand: js.Array[String], onExpand: /* repeated */ js.Any => js.Any, property: String): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  @scala.inline
  implicit class ExpandOps[Self <: Expand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExpand(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

