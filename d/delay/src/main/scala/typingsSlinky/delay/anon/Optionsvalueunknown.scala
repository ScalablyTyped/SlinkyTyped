package typingsSlinky.delay.anon

import typingsSlinky.delay.mod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined delay.delay.Options & {  value ? :unknown} */
@js.native
trait Optionsvalueunknown extends js.Object {
  /**
  		An optional AbortSignal to abort the delay.
  		If aborted, the Promise will be rejected with an AbortError.
  		*/
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
  			Value to reject in the returned promise.
  			*/
  var value: js.UndefOr[js.Any] = js.native
}

object Optionsvalueunknown {
  @scala.inline
  def apply(): Optionsvalueunknown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsvalueunknown]
  }
  @scala.inline
  implicit class OptionsvalueunknownOps[Self <: Optionsvalueunknown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

