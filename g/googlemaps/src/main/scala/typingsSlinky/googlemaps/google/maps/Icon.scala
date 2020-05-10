package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure representing a Marker icon image.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon Maps JavaScript API}
  */
@js.native
trait Icon extends js.Object {
  /**
    * The position at which to anchor an image in correspondence to the
    * location of the marker on the map. By default, the anchor is located
    * along the center point of the bottom of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.anchor Maps JavaScript API}
    */
  var anchor: js.UndefOr[Point] = js.native
  /**
    * The origin of the label relative to the top-left corner of the icon
    * image, if a label is supplied by the marker. By default, the origin is
    * located in the center point of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.labelOrigin Maps JavaScript API}
    */
  var labelOrigin: js.UndefOr[Point] = js.native
  /**
    * The position of the image within a sprite, if any.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.origin Maps JavaScript API}
    */
  var origin: js.UndefOr[Point] = js.native
  /**
    * The size of the entire image after scaling, if any. Use this property to
    * stretch/shrink an image or a sprite.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.scaledSize Maps JavaScript API}
    */
  var scaledSize: js.UndefOr[Size] = js.native
  /**
    * The display size of the sprite or image. When using sprites, you must
    * specify the sprite size. If the size is not provided, it will be set when
    * the image loads.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.size Maps JavaScript API}
    */
  var size: js.UndefOr[Size] = js.native
  /**
    * The URL of the image or sprite sheet.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.url Maps JavaScript API}
    */
  var url: String = js.native
}

object Icon {
  @scala.inline
  def apply(url: String): Icon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def withAnchor(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOrigin(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withScaledSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaledSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

