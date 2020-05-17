package typingsSlinky.nivoTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme * / any, 'tooltip'> */
@js.native
trait Pickanytooltip extends js.Object {
  var tooltip: js.UndefOr[js.Any] = js.native
}

object Pickanytooltip {
  @scala.inline
  def apply(): Pickanytooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pickanytooltip]
  }
  @scala.inline
  implicit class PickanytooltipOps[Self <: Pickanytooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

