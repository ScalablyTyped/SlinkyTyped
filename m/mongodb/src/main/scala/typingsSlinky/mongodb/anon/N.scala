package typingsSlinky.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N extends js.Object {
  //The total count of documents deleted.
  var n: js.UndefOr[Double] = js.native
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[Double] = js.native
}

object N {
  @scala.inline
  def apply(): N = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[N]
  }
  @scala.inline
  implicit class NOps[Self <: N] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.undefined)
        ret
    }
  }
  
}

