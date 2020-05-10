package typingsSlinky.reactAriaModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleId'> */
@js.native
trait PickAriaModalPropstitleId extends js.Object {
  var titleId: js.UndefOr[String] = js.native
}

object PickAriaModalPropstitleId {
  @scala.inline
  def apply(): PickAriaModalPropstitleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAriaModalPropstitleId]
  }
  @scala.inline
  implicit class PickAriaModalPropstitleIdOps[Self <: PickAriaModalPropstitleId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleId")(js.undefined)
        ret
    }
  }
  
}

