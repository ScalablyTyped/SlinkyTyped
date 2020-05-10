package typingsSlinky.mobx.autorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutorunOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  /**
    * Experimental.
    * Warns if the view doesn't track observables
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], _]] = js.native
}

object IAutorunOptions {
  @scala.inline
  def apply(): IAutorunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutorunOptions]
  }
  @scala.inline
  implicit class IAutorunOptionsOps[Self <: IAutorunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresObservable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresObservable")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduler(value: /* callback */ js.Function0[Unit] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.undefined)
        ret
    }
  }
  
}

