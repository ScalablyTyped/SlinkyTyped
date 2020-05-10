package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsedInsight extends Entity {
  var lastUsed: js.UndefOr[UsageDetails] = js.native
  var resource: js.UndefOr[Entity] = js.native
  var resourceReference: js.UndefOr[ResourceReference] = js.native
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.native
}

object UsedInsight {
  @scala.inline
  def apply(): UsedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedInsight]
  }
  @scala.inline
  implicit class UsedInsightOps[Self <: UsedInsight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUsed(value: UsageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceReference(value: ResourceReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceReference")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceVisualization(value: ResourceVisualization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVisualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceVisualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVisualization")(js.undefined)
        ret
    }
  }
  
}

