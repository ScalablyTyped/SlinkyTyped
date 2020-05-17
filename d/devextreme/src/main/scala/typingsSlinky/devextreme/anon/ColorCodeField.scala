package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.gradient
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorCodeField extends js.Object {
  var colorCodeField: js.UndefOr[String] = js.native
  var colorizeGroups: js.UndefOr[Boolean] = js.native
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  var range: js.UndefOr[js.Array[Double]] = js.native
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.native
}

object ColorCodeField {
  @scala.inline
  def apply(): ColorCodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCodeField]
  }
  @scala.inline
  implicit class ColorCodeFieldOps[Self <: ColorCodeField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorCodeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCodeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorCodeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCodeField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorizeGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorizeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorizeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorizeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: discrete | gradient | none | range): Self = {
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

