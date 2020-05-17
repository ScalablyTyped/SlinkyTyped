package typingsSlinky.pgPromise.anon

import typingsSlinky.pgPromise.mod.ITask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cnd[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object Cnd {
  @scala.inline
  def apply[Ext](): Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cnd[Ext]]
  }
  @scala.inline
  implicit class CndOps[Self[ext] <: Cnd[ext], Ext] (val x: Self[Ext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ext] with Other]
    @scala.inline
    def withCndFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCnd: Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: js.Any): Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self[Ext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

