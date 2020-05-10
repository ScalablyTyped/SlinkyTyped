package typingsSlinky.glue.mod

import typingsSlinky.hapi.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var preConnections: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  var preRegister: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  var relativeTo: String = js.native
}

object Options {
  @scala.inline
  def apply(relativeTo: String): Options = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelativeTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreConnections(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preConnections")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRegister(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRegister")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRegister")(js.undefined)
        ret
    }
  }
  
}

