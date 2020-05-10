package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color.
  */
@js.native
trait SchemaColor extends js.Object {
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.native
}

object SchemaColor {
  @scala.inline
  def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  @scala.inline
  implicit class SchemaColorOps[Self <: SchemaColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRgbColor(value: SchemaRgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgbColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbColor")(js.undefined)
        ret
    }
  }
  
}

