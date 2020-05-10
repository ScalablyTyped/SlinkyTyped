package typingsSlinky.iso31662.mod.CountryInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partial extends js.Object {
  var name: String = js.native
  var sub: typingsSlinky.iso31662.mod.SubdivisionInfo.Map = js.native
}

object Partial {
  @scala.inline
  def apply(name: String, sub: typingsSlinky.iso31662.mod.SubdivisionInfo.Map): Partial = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partial]
  }
  @scala.inline
  implicit class PartialOps[Self <: Partial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: typingsSlinky.iso31662.mod.SubdivisionInfo.Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

