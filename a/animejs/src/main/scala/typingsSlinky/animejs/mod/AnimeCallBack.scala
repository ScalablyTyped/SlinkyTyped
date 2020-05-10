package typingsSlinky.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeCallBack extends js.Object {
  var begin: js.UndefOr[AnimeCallbackFunction] = js.native
  var change: js.UndefOr[AnimeCallbackFunction] = js.native
  var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.native
  var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.native
  var complete: js.UndefOr[AnimeCallbackFunction] = js.native
  var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.native
  var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.native
  var update: js.UndefOr[AnimeCallbackFunction] = js.native
}

object AnimeCallBack {
  @scala.inline
  def apply(): AnimeCallBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeCallBack]
  }
  @scala.inline
  implicit class AnimeCallBackOps[Self <: AnimeCallBack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeBegin(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeComplete(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopBegin(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoopBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopComplete(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoopComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* anim */ AnimeInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

