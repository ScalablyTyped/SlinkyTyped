package typingsSlinky.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyPortWrapper extends js.Object {
  @JSName("$")
  var $: Double = js.native
  var `@enabled`: Boolean = js.native
}

object LegacyPortWrapper {
  @scala.inline
  def apply($: Double, `@enabled`: Boolean): LegacyPortWrapper = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.updateDynamic("@enabled")(`@enabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyPortWrapper]
  }
  @scala.inline
  implicit class LegacyPortWrapperOps[Self <: LegacyPortWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with@enabled`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

