package typingsSlinky.istanbulMiddleware

import typingsSlinky.istanbulMiddleware.mod.Matcher
import typingsSlinky.istanbulMiddleware.mod.PostLoadHook
import typingsSlinky.istanbulMiddleware.mod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[PostLoadHook] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object AnonPostLoadHook {
  @scala.inline
  def apply(): AnonPostLoadHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPostLoadHook]
  }
  @scala.inline
  implicit class AnonPostLoadHookOps[Self <: AnonPostLoadHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostLoadHook(
      value: (/* matcherfn */ Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLoadHook")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostLoadHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLoadHook")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

