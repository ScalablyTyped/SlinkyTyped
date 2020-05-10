package typingsSlinky.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base = js.native
  def extend(overrides: js.Object): js.Object = js.native
  def init(args: js.Any*): Unit = js.native
  def mixIn(properties: js.Object): Unit = js.native
}

object Base {
  @scala.inline
  def apply(
    create: /* repeated */ js.Any => Base,
    extend: js.Object => js.Object,
    init: /* repeated */ js.Any => Unit,
    mixIn: js.Object => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), init = js.Any.fromFunction1(init), mixIn = js.Any.fromFunction1(mixIn))
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: /* repeated */ js.Any => Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMixIn(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixIn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

