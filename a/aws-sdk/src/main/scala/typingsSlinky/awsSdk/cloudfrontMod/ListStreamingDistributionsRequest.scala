package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamingDistributionsRequest extends js.Object {
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: js.UndefOr[String] = js.native
}

object ListStreamingDistributionsRequest {
  @scala.inline
  def apply(): ListStreamingDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsRequest]
  }
  @scala.inline
  implicit class ListStreamingDistributionsRequestOps[Self <: ListStreamingDistributionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
  }
  
}

