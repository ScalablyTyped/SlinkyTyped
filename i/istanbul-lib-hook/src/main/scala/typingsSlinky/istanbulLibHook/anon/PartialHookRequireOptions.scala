package typingsSlinky.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRequireOptions> */
@js.native
trait PartialHookRequireOptions extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var postLoadHook: js.UndefOr[js.Function1[/* filename */ String, Unit]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialHookRequireOptions {
  @scala.inline
  def apply(): PartialHookRequireOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookRequireOptions]
  }
  @scala.inline
  implicit class PartialHookRequireOptionsOps[Self <: PartialHookRequireOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPostLoadHook(value: /* filename */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLoadHook")(js.Any.fromFunction1(value))
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

