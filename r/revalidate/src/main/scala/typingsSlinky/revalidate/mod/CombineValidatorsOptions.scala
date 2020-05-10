package typingsSlinky.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombineValidatorsOptions extends js.Object {
  var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.native
}

object CombineValidatorsOptions {
  @scala.inline
  def apply(): CombineValidatorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombineValidatorsOptions]
  }
  @scala.inline
  implicit class CombineValidatorsOptionsOps[Self <: CombineValidatorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializeValues(value: /* values */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeValues")(js.undefined)
        ret
    }
  }
  
}

