package typingsSlinky.reactIntl

import typingsSlinky.reactIntl.mod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-intl.react-intl.WrappedComponentProps<'intl'> */
@js.native
trait WrappedComponentPropsintlIntl extends js.Object {
  var intl: IntlShape = js.native
}

object WrappedComponentPropsintlIntl {
  @scala.inline
  def apply(intl: IntlShape): WrappedComponentPropsintlIntl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintlIntl]
  }
  @scala.inline
  implicit class WrappedComponentPropsintlIntlOps[Self <: WrappedComponentPropsintlIntl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntl(value: IntlShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

