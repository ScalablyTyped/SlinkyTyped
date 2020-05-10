package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metric values in the pivot region.
  */
@js.native
trait SchemaPivotValueRegion extends js.Object {
  /**
    * The values of the metrics in each of the pivot regions.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPivotValueRegion {
  @scala.inline
  def apply(): SchemaPivotValueRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotValueRegion]
  }
  @scala.inline
  implicit class SchemaPivotValueRegionOps[Self <: SchemaPivotValueRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

