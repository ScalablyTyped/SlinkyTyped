package typingsSlinky.moo.mod

import typingsSlinky.moo.mooBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FallbackRule extends js.Object {
  var fallback: `true` = js.native
}

object FallbackRule {
  @scala.inline
  def apply(fallback: `true`): FallbackRule = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackRule]
  }
  @scala.inline
  implicit class FallbackRuleOps[Self <: FallbackRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallback(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

