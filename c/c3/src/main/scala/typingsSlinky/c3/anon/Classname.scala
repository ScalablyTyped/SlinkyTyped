package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classname extends js.Object {
  /** Class to assign to the chart's container SVG element. */
  var classname: js.UndefOr[String] = js.native
}

object Classname {
  @scala.inline
  def apply(): Classname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classname]
  }
  @scala.inline
  implicit class ClassnameOps[Self <: Classname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classname")(js.undefined)
        ret
    }
  }
  
}

