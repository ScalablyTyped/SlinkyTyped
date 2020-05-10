package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An RGB color.
  */
@js.native
trait SchemaRgbColor extends js.Object {
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double] = js.native
}

object SchemaRgbColor {
  @scala.inline
  def apply(): SchemaRgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRgbColor]
  }
  @scala.inline
  implicit class SchemaRgbColorOps[Self <: SchemaRgbColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
  }
  
}

