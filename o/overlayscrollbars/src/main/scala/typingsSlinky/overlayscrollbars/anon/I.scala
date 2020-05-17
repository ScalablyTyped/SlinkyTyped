package typingsSlinky.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I extends js.Object {
  var i: Boolean = js.native
  var n: Boolean = js.native
}

object I {
  @scala.inline
  def apply(i: Boolean, n: Boolean): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  @scala.inline
  implicit class IOps[Self <: I] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

