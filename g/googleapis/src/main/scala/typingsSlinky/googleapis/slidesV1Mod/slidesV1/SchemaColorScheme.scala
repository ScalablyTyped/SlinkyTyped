package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The palette of predefined colors for a page.
  */
@js.native
trait SchemaColorScheme extends js.Object {
  /**
    * The ThemeColorType and corresponding concrete color pairs.
    */
  var colors: js.UndefOr[js.Array[SchemaThemeColorPair]] = js.native
}

object SchemaColorScheme {
  @scala.inline
  def apply(): SchemaColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorScheme]
  }
  @scala.inline
  implicit class SchemaColorSchemeOps[Self <: SchemaColorScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[SchemaThemeColorPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

