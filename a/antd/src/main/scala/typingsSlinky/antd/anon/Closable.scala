package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Closable extends js.Object {
  var closable: Boolean = js.native
}

object Closable {
  @scala.inline
  def apply(closable: Boolean): Closable = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closable]
  }
  @scala.inline
  implicit class ClosableOps[Self <: Closable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

