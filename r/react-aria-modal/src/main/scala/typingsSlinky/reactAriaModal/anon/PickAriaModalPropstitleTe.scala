package typingsSlinky.reactAriaModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleText'> */
@js.native
trait PickAriaModalPropstitleTe extends js.Object {
  var titleText: js.UndefOr[String] = js.native
}

object PickAriaModalPropstitleTe {
  @scala.inline
  def apply(): PickAriaModalPropstitleTe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAriaModalPropstitleTe]
  }
  @scala.inline
  implicit class PickAriaModalPropstitleTeOps[Self <: PickAriaModalPropstitleTe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
  }
  
}

