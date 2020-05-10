package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaForBusinessMetadata extends js.Object {
  /**
    * The ARN of the room resource.
    */
  var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString] = js.native
  /**
    * Starts or stops Alexa for Business.
    */
  var IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.native
}

object AlexaForBusinessMetadata {
  @scala.inline
  def apply(): AlexaForBusinessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlexaForBusinessMetadata]
  }
  @scala.inline
  implicit class AlexaForBusinessMetadataOps[Self <: AlexaForBusinessMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlexaForBusinessRoomArn(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessRoomArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlexaForBusinessRoomArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessRoomArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlexaForBusinessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAlexaForBusinessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlexaForBusinessEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAlexaForBusinessEnabled")(js.undefined)
        ret
    }
  }
  
}

