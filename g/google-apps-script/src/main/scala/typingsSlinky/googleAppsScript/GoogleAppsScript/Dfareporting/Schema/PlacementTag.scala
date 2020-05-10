package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementTag extends js.Object {
  var placementId: js.UndefOr[String] = js.native
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.native
}

object PlacementTag {
  @scala.inline
  def apply(): PlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTag]
  }
  @scala.inline
  implicit class PlacementTagOps[Self <: PlacementTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlacementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementId")(js.undefined)
        ret
    }
    @scala.inline
    def withTagDatas(value: js.Array[TagData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagDatas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagDatas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagDatas")(js.undefined)
        ret
    }
  }
  
}

