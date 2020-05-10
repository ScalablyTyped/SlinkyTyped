package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingBinding extends js.Object {
  var `binding-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
  var `binding-type`: js.UndefOr[BindingType] = js.native
}

object FinishingBinding {
  @scala.inline
  def apply(): FinishingBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingBinding]
  }
  @scala.inline
  implicit class FinishingBindingOps[Self <: FinishingBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBinding-reference-edge`(value: ReferenceEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding-reference-edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBinding-reference-edge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding-reference-edge")(js.undefined)
        ret
    }
    @scala.inline
    def `withBinding-type`(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBinding-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding-type")(js.undefined)
        ret
    }
  }
  
}

