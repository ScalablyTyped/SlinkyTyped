package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sort order associated with a specific column or row.
  */
@js.native
trait SchemaSortSpec extends js.Object {
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.native
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object SchemaSortSpec {
  @scala.inline
  def apply(): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortSpec]
  }
  @scala.inline
  implicit class SchemaSortSpecOps[Self <: SchemaSortSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

