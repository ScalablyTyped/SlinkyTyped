package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Targetdefaults extends js.Object {
  var target_defaults: Cflags = js.native
  var variables: Clang = js.native
}

object Targetdefaults {
  @scala.inline
  def apply(target_defaults: Cflags, variables: Clang): Targetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetdefaults]
  }
  @scala.inline
  implicit class TargetdefaultsOps[Self <: Targetdefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget_defaults(value: Cflags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Clang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

