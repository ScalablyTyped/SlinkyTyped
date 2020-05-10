package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | String] = js.native
}

object SpanOptions {
  @scala.inline
  def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  @scala.inline
  implicit class SpanOptionsOps[Self <: SpanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildOf(value: Transaction | Span | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childOf")(js.undefined)
        ret
    }
  }
  
}

