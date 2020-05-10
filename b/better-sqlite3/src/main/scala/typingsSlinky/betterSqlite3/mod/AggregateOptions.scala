package typingsSlinky.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateOptions extends RegistrationOptions {
  var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.native
  var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.native
  var start: js.UndefOr[js.Any] = js.native
  def step(total: js.Any, next: js.Any): js.Any = js.native
}

object AggregateOptions {
  @scala.inline
  def apply(step: (js.Any, js.Any) => js.Any): AggregateOptions = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[AggregateOptions]
  }
  @scala.inline
  implicit class AggregateOptionsOps[Self <: AggregateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInverse(value: (/* total */ js.Any, /* dropped */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: /* total */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

