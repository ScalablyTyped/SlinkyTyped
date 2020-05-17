package typingsSlinky.moduleDeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builtin extends js.Object {
  var builtin: js.UndefOr[Boolean] = js.native
  var inNodeModules: js.UndefOr[Boolean] = js.native
}

object Builtin {
  @scala.inline
  def apply(): Builtin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builtin]
  }
  @scala.inline
  implicit class BuiltinOps[Self <: Builtin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtin")(js.undefined)
        ret
    }
    @scala.inline
    def withInNodeModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInNodeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNodeModules")(js.undefined)
        ret
    }
  }
  
}

