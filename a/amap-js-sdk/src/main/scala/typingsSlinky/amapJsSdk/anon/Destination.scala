package typingsSlinky.amapJsSdk.anon

import typingsSlinky.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  var destination: js.UndefOr[LngLat] = js.native
  var destinationName: js.UndefOr[String] = js.native
  var origin: js.UndefOr[LngLat] = js.native
  var originName: js.UndefOr[String] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withOrigin(value: LngLat): Self = {
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

