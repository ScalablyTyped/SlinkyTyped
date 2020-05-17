package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowClear extends js.Object {
  var allowClear: Boolean = js.native
  var bordered: Boolean = js.native
  var disabled: Boolean = js.native
  var options: js.Array[scala.Nothing] = js.native
  var transitionName: String = js.native
}

object AllowClear {
  @scala.inline
  def apply(
    allowClear: Boolean,
    bordered: Boolean,
    disabled: Boolean,
    options: js.Array[scala.Nothing],
    transitionName: String
  ): AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowClear]
  }
  @scala.inline
  implicit class AllowClearOps[Self <: AllowClear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

