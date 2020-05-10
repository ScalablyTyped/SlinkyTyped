package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTapesInput extends js.Object {
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  var TapeARNs: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object ListTapesInput {
  @scala.inline
  def apply(): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesInput]
  }
  @scala.inline
  implicit class ListTapesInputOps[Self <: ListTapesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: PositiveIntObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
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
    def withTapeARNs(value: TapeARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARNs")(js.undefined)
        ret
    }
  }
  
}

