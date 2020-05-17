package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Left
import typingsSlinky.exceljs.exceljsStrings.gradient
import typingsSlinky.exceljs.exceljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillGradientPath extends Fill {
  /**
  	 * For 'path' gradient. Specifies the relative coordinates for the start of the path.
  	 * 'left' and 'top' values range from 0 to 1
  	 */
  var center: Left = js.native
  var gradient: path = js.native
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop] = js.native
  var `type`: gradient = js.native
}

object FillGradientPath {
  @scala.inline
  def apply(center: Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillGradientPath]
  }
  @scala.inline
  implicit class FillGradientPathOps[Self <: FillGradientPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStops(value: js.Array[GradientStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

