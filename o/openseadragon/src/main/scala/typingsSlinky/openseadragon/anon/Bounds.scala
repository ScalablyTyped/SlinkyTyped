package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.mod.Point
import typingsSlinky.openseadragon.mod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var bounds: js.UndefOr[Rect] = js.native
  var compositeOperation: js.UndefOr[String] = js.native
  var opacity: Double = js.native
  var scale: js.UndefOr[Double] = js.native
  var translate: js.UndefOr[Point] = js.native
}

object Bounds {
  @scala.inline
  def apply(opacity: Double): Bounds = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
  }
  
}

