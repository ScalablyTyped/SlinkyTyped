package typingsSlinky.chromeApps.chrome.extensionTypes

import typingsSlinky.chromeApps.chrome.extensionTypes.internal.InjectDetailsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectFileDetails extends InjectDetailsBase {
  /** JavaScript or CSS file to inject. */
  var file: String = js.native
}

object InjectFileDetails {
  @scala.inline
  def apply(cssOrigin: CSSOrigin, file: String, runAt: RunAt): InjectFileDetails = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectFileDetails]
  }
  @scala.inline
  implicit class InjectFileDetailsOps[Self <: InjectFileDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

