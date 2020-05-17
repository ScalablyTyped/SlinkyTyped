package typingsSlinky.jdenticon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grayscale extends js.Object {
  /**
    * Specifies the saturation of originally colored shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var color: js.UndefOr[Double] = js.native
  /**
    * Specifies the saturation of originally grayscale shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[Double] = js.native
}

object Grayscale {
  @scala.inline
  def apply(): Grayscale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grayscale]
  }
  @scala.inline
  implicit class GrayscaleOps[Self <: Grayscale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Double): Self = {
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
    def withGrayscale(value: Double): Self = {
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

