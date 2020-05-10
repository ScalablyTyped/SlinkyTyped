package typingsSlinky.egg

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnore extends js.Object {
  var ignore: Set[String] = js.native
}

object AnonIgnore {
  @scala.inline
  def apply(ignore: Set[String]): AnonIgnore = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnore]
  }
  @scala.inline
  implicit class AnonIgnoreOps[Self <: AnonIgnore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

