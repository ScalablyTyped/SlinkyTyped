package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single interpolation point on a gradient conditional format. These pin
  * the gradient color scale according to the color, type and value chosen.
  */
@js.native
trait SchemaInterpolationPoint extends js.Object {
  /**
    * The color this interpolation point should use.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  /**
    * How the value should be interpreted.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value this interpolation point uses.  May be a formula. Unused if
    * type is MIN or MAX.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaInterpolationPoint {
  @scala.inline
  def apply(): SchemaInterpolationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterpolationPoint]
  }
  @scala.inline
  implicit class SchemaInterpolationPointOps[Self <: SchemaInterpolationPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

