package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that applies a gradient color scale format, based on the
  * interpolation points listed. The format of a cell will vary based on its
  * contents as compared to the values of the interpolation points.
  */
@js.native
trait SchemaGradientRule extends js.Object {
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
}

object SchemaGradientRule {
  @scala.inline
  def apply(): SchemaGradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradientRule]
  }
  @scala.inline
  implicit class SchemaGradientRuleOps[Self <: SchemaGradientRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxpoint(value: SchemaInterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMidpoint(value: SchemaInterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMinpoint(value: SchemaInterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minpoint")(js.undefined)
        ret
    }
  }
  
}

