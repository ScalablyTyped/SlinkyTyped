package typingsSlinky.jqueryAjaxfile

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedDefine[T] extends js.Object {
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.native
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.native
  var owner: js.UndefOr[js.Any] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  def read(): T = js.native
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](read: () => T): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
  @scala.inline
  implicit class KnockoutComputedDefineOps[Self[t] <: KnockoutComputedDefine[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRead(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeferEvaluation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEvaluation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvaluation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeWhen(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisposeWhen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeWhenNodeIsRemoved(value: Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhenNodeIsRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposeWhenNodeIsRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeWhenNodeIsRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* value */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

