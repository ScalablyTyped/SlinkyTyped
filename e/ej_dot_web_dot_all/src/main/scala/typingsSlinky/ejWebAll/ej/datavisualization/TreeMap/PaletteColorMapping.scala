package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteColorMapping extends js.Object {
  /** Specifies the colors of the paletteColorMapping
    * @Default {[]}
    */
  var colors: js.UndefOr[js.Array[_]] = js.native
}

object PaletteColorMapping {
  @scala.inline
  def apply(): PaletteColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaletteColorMapping]
  }
  @scala.inline
  implicit class PaletteColorMappingOps[Self <: PaletteColorMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[_]): Self = {
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

