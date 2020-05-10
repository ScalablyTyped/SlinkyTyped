package typingsSlinky.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateOptions extends js.Object {
  /**
    *  {boolean=true}, If true will inherit url parameters from current url.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * {boolean=true|string=} - If true will update the url in the location bar, if false will not. If string, must be "replace", which will update url and also replace last history record.
    */
  var location: js.UndefOr[Boolean | String] = js.native
  /**
    * {boolean=true}, If true will broadcast $stateChangeStart and $stateChangeSuccess events.
    */
  @JSName("notify")
  var notify_FIStateOptions: js.UndefOr[Boolean] = js.native
  /**
    * {object=$state.$current}, When transitioning with relative path (e.g '^'), defines which state to be relative from.
    */
  var relative: js.UndefOr[IState] = js.native
  /**
    * {boolean=false|string|IState}, If true will force transition even if the state or params have not changed, aka a reload of the same state. It differs from reloadOnSearch because you'd use this when you want to force a reload when everything is the same, including search params.
    */
  var reload: js.UndefOr[Boolean | String | IState] = js.native
}

object IStateOptions {
  @scala.inline
  def apply(): IStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateOptions]
  }
  @scala.inline
  implicit class IStateOptionsOps[Self <: IStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: IState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: Boolean | String | IState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
  }
  
}

