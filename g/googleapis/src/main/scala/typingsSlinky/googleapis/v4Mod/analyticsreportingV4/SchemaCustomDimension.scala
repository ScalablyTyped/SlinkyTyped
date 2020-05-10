package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom dimension.
  */
@js.native
trait SchemaCustomDimension extends js.Object {
  /**
    * Slot number of custom dimension.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Value of the custom dimension. Default value (i.e. empty string)
    * indicates clearing sesion/visitor scope custom dimension value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomDimension {
  @scala.inline
  def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  @scala.inline
  implicit class SchemaCustomDimensionOps[Self <: SchemaCustomDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

