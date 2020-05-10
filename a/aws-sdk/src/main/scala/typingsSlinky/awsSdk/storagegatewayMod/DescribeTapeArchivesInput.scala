package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeArchivesInput extends js.Object {
  /**
    * Specifies that the number of virtual tapes descried be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * An opaque string that indicates the position at which to begin describing virtual tapes.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
    */
  var TapeARNs: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object DescribeTapeArchivesInput {
  @scala.inline
  def apply(): DescribeTapeArchivesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeArchivesInput]
  }
  @scala.inline
  implicit class DescribeTapeArchivesInputOps[Self <: DescribeTapeArchivesInput] (val x: Self) extends AnyVal {
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

