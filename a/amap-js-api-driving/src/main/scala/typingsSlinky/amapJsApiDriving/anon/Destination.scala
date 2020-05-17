package typingsSlinky.amapJsApiDriving.anon

import typingsSlinky.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  var destination: LocationValue = js.native
  var destinationName: js.UndefOr[String] = js.native
  var origin: LocationValue = js.native
  var originName: js.UndefOr[String] = js.native
}

object Destination {
  @scala.inline
  def apply(destination: LocationValue, origin: LocationValue): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: LocationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: LocationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originName")(js.undefined)
        ret
    }
  }
  
}

