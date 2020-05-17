package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScale extends XConditionEntry {
  var ColorScaleEntries: SafeArray[XColorScaleEntry] = js.native
}

object ColorScale {
  @scala.inline
  def apply(
    ColorScaleEntries: SafeArray[XColorScaleEntry],
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ColorScale]
  }
  @scala.inline
  implicit class ColorScaleOps[Self <: ColorScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorScaleEntries(value: SafeArray[XColorScaleEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorScaleEntries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

