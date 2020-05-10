package typingsSlinky.aliApp

import typingsSlinky.aliApp.my.LaunchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.AppOptions & ali-app.my.App> */
@js.native
trait PartialAppOptionsApp extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var getCurrentPage: js.UndefOr[js.Function0[typingsSlinky.aliApp.my.Page]] = js.native
  var globalData: js.UndefOr[js.Object] = js.native
  var onError: js.UndefOr[js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* msg */ String, Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ typingsSlinky.aliApp.my.App, Unit]] = js.native
  var onLaunch: js.UndefOr[
    js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* option */ LaunchOptions, Unit]
  ] = js.native
  var onShow: js.UndefOr[
    js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* option */ LaunchOptions, Unit]
  ] = js.native
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ typingsSlinky.aliApp.my.App, Unit]] = js.native
}

object PartialAppOptionsApp {
  @scala.inline
  def apply(): PartialAppOptionsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAppOptionsApp]
  }
  @scala.inline
  implicit class PartialAppOptionsAppOps[Self <: PartialAppOptionsApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentPage(value: () => typingsSlinky.aliApp.my.Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* msg */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: js.ThisFunction0[/* this */ typingsSlinky.aliApp.my.App, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLaunch(value: js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* option */ LaunchOptions, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.ThisFunction1[/* this */ typingsSlinky.aliApp.my.App, /* option */ LaunchOptions, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnlaunch(value: js.ThisFunction0[/* this */ typingsSlinky.aliApp.my.App, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnlaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnlaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnlaunch")(js.undefined)
        ret
    }
  }
  
}

