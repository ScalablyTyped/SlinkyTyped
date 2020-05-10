package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttrDimDef...
  */
@js.native
trait INxAttrDimDef extends js.Object {
  /**
    * Expression or field name.
    */
  var qDef: String = js.native
  /**
    * LibraryId for dimension.
    */
  var qLibraryId: String = js.native
  /**
    * Sorting
    */
  var qSortBy: ISortCriteria = js.native
}

object INxAttrDimDef {
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: ISortCriteria): INxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimDef]
  }
  @scala.inline
  implicit class INxAttrDimDefOps[Self <: INxAttrDimDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortBy(value: ISortCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

