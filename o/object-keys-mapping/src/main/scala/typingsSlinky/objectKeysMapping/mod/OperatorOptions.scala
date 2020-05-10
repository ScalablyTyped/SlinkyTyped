package typingsSlinky.objectKeysMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatorOptions extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.native
  var mapping: js.UndefOr[js.Object] = js.native
}

object OperatorOptions {
  @scala.inline
  def apply(): OperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorOptions]
  }
  @scala.inline
  implicit class OperatorOptionsOps[Self <: OperatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamelcase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelcase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelcase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelcase")(js.undefined)
        ret
    }
    @scala.inline
    def withMapping(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
  }
  
}

