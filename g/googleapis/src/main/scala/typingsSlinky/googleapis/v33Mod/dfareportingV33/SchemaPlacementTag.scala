package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag
  */
@js.native
trait SchemaPlacementTag extends js.Object {
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[SchemaTagData]] = js.native
}

object SchemaPlacementTag {
  @scala.inline
  def apply(): SchemaPlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTag]
  }
  @scala.inline
  implicit class SchemaPlacementTagOps[Self <: SchemaPlacementTag] (val x: Self) extends AnyVal {
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
    def withTagDatas(value: js.Array[SchemaTagData]): Self = {
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

