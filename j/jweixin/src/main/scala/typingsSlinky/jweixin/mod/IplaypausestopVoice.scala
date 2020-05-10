package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IplaypausestopVoice extends BaseParams {
  var localId: String = js.native
}

object IplaypausestopVoice {
  @scala.inline
  def apply(localId: String): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IplaypausestopVoice]
  }
  @scala.inline
  implicit class IplaypausestopVoiceOps[Self <: IplaypausestopVoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

