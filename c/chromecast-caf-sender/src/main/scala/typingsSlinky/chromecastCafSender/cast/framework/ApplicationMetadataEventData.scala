package typingsSlinky.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMetadataEventData extends EventData {
  var metadata: ApplicationMetadata = js.native
}

object ApplicationMetadataEventData {
  @scala.inline
  def apply(metadata: ApplicationMetadata, `type`: String): ApplicationMetadataEventData = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadataEventData]
  }
  @scala.inline
  implicit class ApplicationMetadataEventDataOps[Self <: ApplicationMetadataEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: ApplicationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

