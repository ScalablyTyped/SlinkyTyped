package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacePhotoRequest extends js.Object {
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxheight: js.UndefOr[Double] = js.native
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxwidth: js.UndefOr[Double] = js.native
  /**
    * string identifier that uniquely identifies a photo.
    * Photo references are returned from either a Place Search or Place Details request.
    */
  var photoreference: String = js.native
}

object PlacePhotoRequest {
  @scala.inline
  def apply(photoreference: String): PlacePhotoRequest = {
    val __obj = js.Dynamic.literal(photoreference = photoreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhotoRequest]
  }
  @scala.inline
  implicit class PlacePhotoRequestOps[Self <: PlacePhotoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhotoreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxheight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxwidth")(js.undefined)
        ret
    }
  }
  
}

