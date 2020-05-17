package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-intl.react-intl/lib/components/injectIntl.WrappedComponentProps<'intl'> */
@js.native
trait WrappedComponentPropsintl extends js.Object {
  var intl: IntlShape = js.native
}

object WrappedComponentPropsintl {
  @scala.inline
  def apply(intl: IntlShape): WrappedComponentPropsintl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintl]
  }
  @scala.inline
  implicit class WrappedComponentPropsintlOps[Self <: WrappedComponentPropsintl] (val x: Self) extends AnyVal {
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

