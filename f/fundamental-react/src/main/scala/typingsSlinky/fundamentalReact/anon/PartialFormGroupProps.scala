package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
@js.native
trait PartialFormGroupProps extends js.Object {
  var disableStyles: js.UndefOr[Boolean] = js.native
}

object PartialFormGroupProps {
  @scala.inline
  def apply(): PartialFormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormGroupProps]
  }
  @scala.inline
  implicit class PartialFormGroupPropsOps[Self <: PartialFormGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
  }
  
}

