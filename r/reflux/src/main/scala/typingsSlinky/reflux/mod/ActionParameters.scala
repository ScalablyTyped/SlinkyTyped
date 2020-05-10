package typingsSlinky.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionParameters extends js.Object {
  var asyncResult: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[String]] = js.native
  var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]]] = js.native
  var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, Boolean]] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object ActionParameters {
  @scala.inline
  def apply(): ActionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionParameters]
  }
  @scala.inline
  implicit class ActionParametersOps[Self <: ActionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResult")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withPreEmit(value: /* repeated */ js.Any => js.UndefOr[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preEmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldEmit(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

