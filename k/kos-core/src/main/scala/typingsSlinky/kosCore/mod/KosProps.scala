package typingsSlinky.kosCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KosProps[T] extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], Unit]] = js.native
  var getNamespace: js.UndefOr[js.Function0[String]] = js.native
  var getParam: js.UndefOr[js.Function0[_]] = js.native
}

object KosProps {
  @scala.inline
  def apply[T](): KosProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KosProps[T]]
  }
  @scala.inline
  implicit class KosPropsOps[Self[t] <: KosProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDispatch(value: /* action */ Action[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNamespace(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNamespace: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParam(value: () => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParam: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParam")(js.undefined)
        ret
    }
  }
  
}

