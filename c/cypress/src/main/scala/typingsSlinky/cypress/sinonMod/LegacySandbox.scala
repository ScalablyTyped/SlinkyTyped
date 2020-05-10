package typingsSlinky.cypress.sinonMod

import typingsSlinky.cypress.Anon3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacySandbox extends js.Object {
  var sandbox: Anon3 = js.native
}

object LegacySandbox {
  @scala.inline
  def apply(sandbox: Anon3): LegacySandbox = {
    val __obj = js.Dynamic.literal(sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacySandbox]
  }
  @scala.inline
  implicit class LegacySandboxOps[Self <: LegacySandbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSandbox(value: Anon3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

