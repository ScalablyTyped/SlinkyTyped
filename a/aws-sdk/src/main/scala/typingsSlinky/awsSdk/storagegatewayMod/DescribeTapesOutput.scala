package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapesOutput extends js.Object {
  /**
    * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of results. If a response does not contain a marker, then there are no more results to be retrieved.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of virtual tape descriptions.
    */
  var Tapes: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tapes] = js.native
}

object DescribeTapesOutput {
  @scala.inline
  def apply(): DescribeTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapesOutput]
  }
  @scala.inline
  implicit class DescribeTapesOutputOps[Self <: DescribeTapesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: Marker): Self = {
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
    def withTapes(value: Tapes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tapes")(js.undefined)
        ret
    }
  }
  
}

