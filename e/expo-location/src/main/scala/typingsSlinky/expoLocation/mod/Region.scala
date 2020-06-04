package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var notifyOnEnter: js.UndefOr[Boolean] = js.undefined
  var notifyOnExit: js.UndefOr[Boolean] = js.undefined
  var radius: Double
}

object Region {
  @scala.inline
  def apply(latitude: Double, longitude: Double, radius: Double): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNotifyOnEnter(value: Boolean): Self = this.set("notifyOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyOnEnter: Self = this.set("notifyOnEnter", js.undefined)
    @scala.inline
    def setNotifyOnExit(value: Boolean): Self = this.set("notifyOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyOnExit: Self = this.set("notifyOnExit", js.undefined)
  }
  
}

