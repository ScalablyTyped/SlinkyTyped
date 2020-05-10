package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compensation range.
  */
@js.native
trait SchemaCompensationRange extends js.Object {
  /**
    * Optional.  The maximum amount of compensation. If left empty, the value
    * is set to a maximal compensation value and the currency code is set to
    * match the currency code of min_compensation.
    */
  var maxCompensation: js.UndefOr[SchemaMoney] = js.native
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var minCompensation: js.UndefOr[SchemaMoney] = js.native
}

object SchemaCompensationRange {
  @scala.inline
  def apply(): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationRange]
  }
  @scala.inline
  implicit class SchemaCompensationRangeOps[Self <: SchemaCompensationRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCompensation(value: SchemaMoney): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCompensation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCompensation")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCompensation(value: SchemaMoney): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCompensation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCompensation")(js.undefined)
        ret
    }
  }
  
}

