package typingsSlinky.java.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions extends js.Object {
  var asyncSuffix: js.UndefOr[String] = js.native
  var promiseSuffix: js.UndefOr[String] = js.native
  var promisify: js.UndefOr[Promisify] = js.native
  var syncSuffix: String = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(syncSuffix: String): AsyncOptions = {
    val __obj = js.Dynamic.literal(syncSuffix = syncSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPromisify(value: (/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any]) => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promisify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPromisify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promisify")(js.undefined)
        ret
    }
  }
  
}

