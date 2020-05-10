package typingsSlinky.pixiJs.PIXI.Application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.Application
  * @typedef {object} Plugin
  * @property {function} init - Called when Application is constructed, scoped to Application instance.
  *  Passes in `options` as the only argument, which are Application constructor options.
  * @property {function} destroy - Called when destroying Application, scoped to Application instance
  */
@js.native
trait Plugin extends js.Object {
  def destroy(params: js.Any*): js.Any = js.native
  def init(params: js.Any*): js.Any = js.native
}

object Plugin {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => js.Any, init: /* repeated */ js.Any => js.Any): Plugin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

