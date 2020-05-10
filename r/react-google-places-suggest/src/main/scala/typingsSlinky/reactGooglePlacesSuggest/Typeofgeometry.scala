package typingsSlinky.reactGooglePlacesSuggest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofgeometry extends js.Object {
  val encoding: Typeofencoding = js.native
  val poly: Typeofpoly = js.native
  /**
    * Utility functions for computing geodesic angles, distances and areas.
    * The default radius is Earth's radius of 6378137 meters.
    */
  val spherical: Typeofspherical = js.native
}

object Typeofgeometry {
  @scala.inline
  def apply(encoding: Typeofencoding, poly: Typeofpoly, spherical: Typeofspherical): Typeofgeometry = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
  @scala.inline
  implicit class TypeofgeometryOps[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: Typeofencoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoly(value: Typeofpoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpherical(value: Typeofspherical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spherical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

