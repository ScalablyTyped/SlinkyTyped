package typingsSlinky.nivoTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme * / any, 'tooltip'> */
trait Pickanytooltip extends js.Object {
  var tooltip: js.UndefOr[js.Any] = js.undefined
}

object Pickanytooltip {
  @scala.inline
  def apply(tooltip: js.Any = null): Pickanytooltip = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pickanytooltip]
  }
}

