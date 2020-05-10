package typingsSlinky.itPushable

import typingsSlinky.itPushable.itPushableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined it-pushable.it-pushable.Options & {  writev  :true} */
@js.native
trait Optionswritevtrue extends js.Object {
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], _]] = js.native
  var writev: js.UndefOr[Boolean with `true`] = js.native
}

object Optionswritevtrue {
  @scala.inline
  def apply(): Optionswritevtrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionswritevtrue]
  }
  @scala.inline
  implicit class OptionswritevtrueOps[Self <: Optionswritevtrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnd(value: /* err */ js.UndefOr[js.Error] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWritev(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(js.undefined)
        ret
    }
  }
  
}

