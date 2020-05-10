package typingsSlinky.angularFileUpload.mod

import org.scalajs.dom.raw.File
import typingsSlinky.angular.mod.IDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var fn: SyncFilter | AsyncFilter = js.native
  var name: String = js.native
}

object Filter {
  @scala.inline
  def apply(fn: SyncFilter | AsyncFilter, name: String): Filter = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFnFunction2(value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFnFunction3(
      value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], /* deferred */ IDeferred[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFn(value: SyncFilter | AsyncFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

