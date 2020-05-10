package typingsSlinky.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalHistoryOptions extends js.Object {
  /**
    * Use hash change when present.
    * @default true
    */
  var hashChange: js.UndefOr[Boolean] = js.native
  /**
    * Use push state when present.
    * @default false
    */
  var pushState: js.UndefOr[Boolean] = js.native
  /**
    * The url root used to extract the fragment when using push state.
    */
  var root: js.UndefOr[String] = js.native
  /**
    * The function that will be called back when the fragment changes.
    */
  var routeHandler: js.UndefOr[js.Function1[/* fragment */ String, Unit]] = js.native
  /**
    * Prevents loading of the current url when activating history.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Override default history init behavior by navigating directly to this route.
    */
  var startRoute: js.UndefOr[String] = js.native
}

object DurandalHistoryOptions {
  @scala.inline
  def apply(): DurandalHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalHistoryOptions]
  }
  @scala.inline
  implicit class DurandalHistoryOptionsOps[Self <: DurandalHistoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPushState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteHandler(value: /* fragment */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRouteHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRoute")(js.undefined)
        ret
    }
  }
  
}

