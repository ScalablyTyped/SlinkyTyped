package typingsSlinky.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lat extends js.Object {
  /** Location's latitude. */
  var lat: js.UndefOr[Double] = js.native
  /** Location's longitude. */
  var lng: js.UndefOr[Double] = js.native
  /** Location name. */
  var name: js.UndefOr[String] = js.native
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[String] = js.native
}

object Lat {
  @scala.inline
  def apply(): Lat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lat]
  }
  @scala.inline
  implicit class LatOps[Self <: Lat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.undefined)
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
  }
  
}

