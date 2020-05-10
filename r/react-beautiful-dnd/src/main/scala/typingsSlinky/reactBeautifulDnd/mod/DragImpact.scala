package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragImpact extends js.Object {
  var at: js.UndefOr[ImpactLocation] = js.native
  var displaced: DisplacementGroups = js.native
  var displacedBy: DisplacedBy = js.native
}

object DragImpact {
  @scala.inline
  def apply(displaced: DisplacementGroups, displacedBy: DisplacedBy): DragImpact = {
    val __obj = js.Dynamic.literal(displaced = displaced.asInstanceOf[js.Any], displacedBy = displacedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragImpact]
  }
  @scala.inline
  implicit class DragImpactOps[Self <: DragImpact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplaced(value: DisplacementGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplacedBy(value: DisplacedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: ImpactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
  }
  
}

