package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbJsStatic extends js.Object {
  def cmp(key1: js.Any, key2: js.Any): Double = js.native
  def delete(dbName: String): js.Promise[Unit] = js.native
  def open(options: OpenOptions): js.Promise[Server] = js.native
}

object DbJsStatic {
  @scala.inline
  def apply(
    cmp: (js.Any, js.Any) => Double,
    delete: String => js.Promise[Unit],
    open: OpenOptions => js.Promise[Server]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal(cmp = js.Any.fromFunction2(cmp), delete = js.Any.fromFunction1(delete), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[DbJsStatic]
  }
  @scala.inline
  implicit class DbJsStaticOps[Self <: DbJsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmp(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: OpenOptions => js.Promise[Server]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

