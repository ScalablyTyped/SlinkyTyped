package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair mapping a theme color type to the concrete color it represents.
  */
@js.native
trait SchemaThemeColorPair extends js.Object {
  /**
    * The concrete color corresponding to the theme color type above.
    */
  var color: js.UndefOr[SchemaRgbColor] = js.native
  /**
    * The type of the theme color.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaThemeColorPair {
  @scala.inline
  def apply(): SchemaThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThemeColorPair]
  }
  @scala.inline
  implicit class SchemaThemeColorPairOps[Self <: SchemaThemeColorPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: SchemaRgbColor): Self = {
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
  }
  
}

