package typingsSlinky.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHookerOptions extends js.Object {
  var once: js.UndefOr[Boolean] = js.native
  var passName: js.UndefOr[Boolean] = js.native
  var post: js.UndefOr[HookerPostHookFunction] = js.native
  var pre: js.UndefOr[HookerPreHookFunction] = js.native
}

object IHookerOptions {
  @scala.inline
  def apply(): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHookerOptions]
  }
  @scala.inline
  implicit class IHookerOptionsOps[Self <: IHookerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withPassName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passName")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: (/* result */ js.Any, /* repeated */ js.Any) => IHookerPostHookResult | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: /* repeated */ js.Any => IHookerPreHookResult | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

