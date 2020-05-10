package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeobfuscationFile extends js.Object {
  /** The type of the deobfuscation file. */
  var symbolType: js.UndefOr[String] = js.native
}

object DeobfuscationFile {
  @scala.inline
  def apply(): DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeobfuscationFile]
  }
  @scala.inline
  implicit class DeobfuscationFileOps[Self <: DeobfuscationFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSymbolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(js.undefined)
        ret
    }
  }
  
}

