package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Offset
  */
@js.native
trait SchemaVideoOffset extends js.Object {
  /**
    * Duration, as a percentage of video duration. Do not set when
    * offsetSeconds is set. Acceptable values are 0 to 100, inclusive.
    */
  var offsetPercentage: js.UndefOr[Double] = js.native
  /**
    * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable
    * values are 0 to 86399, inclusive.
    */
  var offsetSeconds: js.UndefOr[Double] = js.native
}

object SchemaVideoOffset {
  @scala.inline
  def apply(): SchemaVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoOffset]
  }
  @scala.inline
  implicit class SchemaVideoOffsetOps[Self <: SchemaVideoOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSeconds")(js.undefined)
        ret
    }
  }
  
}

