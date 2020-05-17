package typingsSlinky.croppie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orientation extends js.Object {
  var orientation: js.UndefOr[Double] = js.native
  var points: js.UndefOr[js.Array[Double]] = js.native
  var url: String = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Orientation {
  @scala.inline
  def apply(url: String): Orientation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
  @scala.inline
  implicit class OrientationOps[Self <: Orientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

