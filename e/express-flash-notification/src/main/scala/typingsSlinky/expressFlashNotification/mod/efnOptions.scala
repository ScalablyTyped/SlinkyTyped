package typingsSlinky.expressFlashNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait efnOptions extends js.Object {
  var afterAllRender: js.UndefOr[
    js.Function2[
      /* htmlFragments */ js.Array[String], 
      /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit], 
      Unit
    ]
  ] = js.native
  var beforeSingleRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var localsName: js.UndefOr[String] = js.native
  var sessionName: js.UndefOr[String] = js.native
  var utilityName: js.UndefOr[String] = js.native
  var viewName: js.UndefOr[String] = js.native
}

object efnOptions {
  @scala.inline
  def apply(): efnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[efnOptions]
  }
  @scala.inline
  implicit class efnOptionsOps[Self <: efnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAllRender(
      value: (/* htmlFragments */ js.Array[String], /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterAllRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSingleRender(
      value: (/* item */ js.Any, /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSingleRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSingleRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSingleRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsName")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilityName")(js.undefined)
        ret
    }
    @scala.inline
    def withViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(js.undefined)
        ret
    }
  }
  
}

