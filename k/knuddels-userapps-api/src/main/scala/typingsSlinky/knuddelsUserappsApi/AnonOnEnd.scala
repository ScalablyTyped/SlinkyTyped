package typingsSlinky.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnEnd extends js.Object {
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
}

object AnonOnEnd {
  @scala.inline
  def apply(): AnonOnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnEnd]
  }
  @scala.inline
  implicit class AnonOnEndOps[Self <: AnonOnEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnd(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

