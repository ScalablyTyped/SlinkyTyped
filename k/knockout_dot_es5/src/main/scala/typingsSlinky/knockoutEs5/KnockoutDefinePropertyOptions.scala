package typingsSlinky.knockoutEs5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutDefinePropertyOptions extends js.Object {
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  def get(): js.Any = js.native
}

object KnockoutDefinePropertyOptions {
  @scala.inline
  def apply(get: () => js.Any): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
  @scala.inline
  implicit class KnockoutDefinePropertyOptionsOps[Self <: KnockoutDefinePropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
  }
  
}

