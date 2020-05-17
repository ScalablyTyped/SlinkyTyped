package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.mod.global.ioBroker.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl[T /* <: AnyObject */] extends js.Object {
  var _id: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
  ] = js.native
  var acl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any
  ] = js.native
}

object Acl {
  @scala.inline
  def apply[T](): Acl[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acl[T]]
  }
  @scala.inline
  implicit class AclOps[Self[t] <: Acl[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_id(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAcl(value: /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
  }
  
}

