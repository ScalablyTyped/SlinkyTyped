package typingsSlinky.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataOptions extends js.Object {
  var metadataType: MetadataOptionsType = js.native
}

object MetadataOptions {
  @scala.inline
  def apply(metadataType: MetadataOptionsType): MetadataOptions = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataOptions]
  }
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadataType(value: MetadataOptionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

