package typingsSlinky.reactNativeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v4 extends js.Object {
  var random: js.UndefOr[js.Array[Double]] = js.native
  var rng: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
}

object v4 {
  @scala.inline
  def apply(): v4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[v4]
  }
  @scala.inline
  implicit class v4Ops[Self <: v4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandom(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withRng(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rng")(js.undefined)
        ret
    }
  }
  
}

