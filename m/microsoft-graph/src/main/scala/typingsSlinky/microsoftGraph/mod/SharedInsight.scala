package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedInsight extends Entity {
  var lastShared: js.UndefOr[SharingDetail] = js.native
  var lastSharedMethod: js.UndefOr[Entity] = js.native
  var resource: js.UndefOr[Entity] = js.native
  var resourceReference: js.UndefOr[ResourceReference] = js.native
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.native
  var sharingHistory: js.UndefOr[js.Array[SharingDetail]] = js.native
}

object SharedInsight {
  @scala.inline
  def apply(): SharedInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedInsight]
  }
  @scala.inline
  implicit class SharedInsightOps[Self <: SharedInsight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastShared(value: SharingDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastShared")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSharedMethod(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSharedMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSharedMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSharedMethod")(js.undefined)
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
    @scala.inline
    def withSharingHistory(value: js.Array[SharingDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingHistory")(js.undefined)
        ret
    }
  }
  
}

