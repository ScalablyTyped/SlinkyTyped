package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlways extends js.Object {
  def always(e: js.Any, t: js.Any): js.Any = js.native
  def otherwise(e: js.Any): js.Any = js.native
  def spread(t: js.Any): js.Any = js.native
  def `then`(e: js.Any): js.Any = js.native
  def `yield`(e: js.Any): js.Any = js.native
}

object AnonAlways {
  @scala.inline
  def apply(
    always: (js.Any, js.Any) => js.Any,
    otherwise: js.Any => js.Any,
    spread: js.Any => js.Any,
    `then`: js.Any => js.Any,
    `yield`: js.Any => js.Any
  ): AnonAlways = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction2(always), otherwise = js.Any.fromFunction1(otherwise), spread = js.Any.fromFunction1(spread))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.updateDynamic("yield")(js.Any.fromFunction1(`yield`))
    __obj.asInstanceOf[AnonAlways]
  }
  @scala.inline
  implicit class AnonAlwaysOps[Self <: AnonAlways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOtherwise(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpread(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThen(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYield(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yield")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

