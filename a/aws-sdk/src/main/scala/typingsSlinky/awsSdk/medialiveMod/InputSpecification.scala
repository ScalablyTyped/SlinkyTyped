package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSpecification extends js.Object {
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.native
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.native
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.native
}

object InputSpecification {
  @scala.inline
  def apply(): InputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecification]
  }
  @scala.inline
  implicit class InputSpecificationOps[Self <: InputSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: InputCodec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBitrate(value: InputMaximumBitrate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: InputResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(js.undefined)
        ret
    }
  }
  
}

