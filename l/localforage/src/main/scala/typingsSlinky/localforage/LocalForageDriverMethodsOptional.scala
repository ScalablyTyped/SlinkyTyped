package typingsSlinky.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDriverMethodsOptional extends js.Object {
  var dropInstance: js.UndefOr[LocalForageDropInstanceFn] = js.native
}

object LocalForageDriverMethodsOptional {
  @scala.inline
  def apply(): LocalForageDriverMethodsOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageDriverMethodsOptional]
  }
  @scala.inline
  implicit class LocalForageDriverMethodsOptionalOps[Self <: LocalForageDriverMethodsOptional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropInstance(
      value: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, Unit]]) => js.Promise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropInstance")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropInstance")(js.undefined)
        ret
    }
  }
  
}

