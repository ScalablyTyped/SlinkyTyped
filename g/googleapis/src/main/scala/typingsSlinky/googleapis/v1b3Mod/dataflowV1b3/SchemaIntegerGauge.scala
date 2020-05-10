package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing temporal values of a variable.
  */
@js.native
trait SchemaIntegerGauge extends js.Object {
  /**
    * The time at which this value was measured. Measured as msecs from epoch.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The value of the variable represented by this gauge.
    */
  var value: js.UndefOr[SchemaSplitInt64] = js.native
}

object SchemaIntegerGauge {
  @scala.inline
  def apply(): SchemaIntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerGauge]
  }
  @scala.inline
  implicit class SchemaIntegerGaugeOps[Self <: SchemaIntegerGauge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SchemaSplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

