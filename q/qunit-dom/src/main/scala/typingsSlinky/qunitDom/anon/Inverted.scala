package typingsSlinky.qunitDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.native
}

object Inverted {
  @scala.inline
  def apply(): Inverted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inverted]
  }
  @scala.inline
  implicit class InvertedOps[Self <: Inverted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
  }
  
}

