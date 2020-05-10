package typingsSlinky.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequirePeerFunctionOptions extends js.Object {
  var dontThrow: js.UndefOr[Boolean] = js.native
  var optional: js.UndefOr[Boolean] = js.native
}

object RequirePeerFunctionOptions {
  @scala.inline
  def apply(): RequirePeerFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequirePeerFunctionOptions]
  }
  @scala.inline
  implicit class RequirePeerFunctionOptionsOps[Self <: RequirePeerFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDontThrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontThrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontThrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontThrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

