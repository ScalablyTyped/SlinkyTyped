package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a floating point mean metric contribution.
  */
@js.native
trait SchemaFloatingPointMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double] = js.native
}

object SchemaFloatingPointMean {
  @scala.inline
  def apply(): SchemaFloatingPointMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointMean]
  }
  @scala.inline
  implicit class SchemaFloatingPointMeanOps[Self <: SchemaFloatingPointMean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: SchemaSplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
  }
  
}

