package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a single performance measure or data point
  */
@js.native
trait SchemaPerfSample extends js.Object {
  /**
    * Timestamp of collection
    */
  var sampleTime: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * Value observed
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaPerfSample {
  @scala.inline
  def apply(): SchemaPerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfSample]
  }
  @scala.inline
  implicit class SchemaPerfSampleOps[Self <: SchemaPerfSample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSampleTime(value: SchemaTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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

