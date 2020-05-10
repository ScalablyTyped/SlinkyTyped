package typingsSlinky.jdenticon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColor extends js.Object {
  /**
    * Specifies the lightness range of colored shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specifies the lightness range of grayscale shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[js.Array[Double]] = js.native
}

object AnonColor {
  @scala.inline
  def apply(): AnonColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColor]
  }
  @scala.inline
  implicit class AnonColorOps[Self <: AnonColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: js.Array[Double]): Self = {
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
    def withGrayscale(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrayscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(js.undefined)
        ret
    }
  }
  
}

