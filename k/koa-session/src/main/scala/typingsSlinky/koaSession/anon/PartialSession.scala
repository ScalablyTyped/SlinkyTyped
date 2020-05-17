package typingsSlinky.koaSession.anon

import typingsSlinky.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.Session> */
@js.native
trait PartialSession extends js.Object {
  var inspect: js.UndefOr[js.Function0[js.Object]] = js.native
  var length: js.UndefOr[Double] = js.native
  var maxAge: js.UndefOr[Double | session] = js.native
  var populated: js.UndefOr[Boolean] = js.native
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  var toJSON: js.UndefOr[js.Function0[js.Object]] = js.native
}

object PartialSession {
  @scala.inline
  def apply(): PartialSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSession]
  }
  @scala.inline
  implicit class PartialSessionOps[Self <: PartialSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspect(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double | session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populated")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.undefined)
        ret
    }
  }
  
}

