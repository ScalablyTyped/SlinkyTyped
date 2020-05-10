package typingsSlinky.expoFileSystem.fileSystemTypesMod

import typingsSlinky.expoFileSystem.expoFileSystemStrings.base64
import typingsSlinky.expoFileSystem.expoFileSystemStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritingOptions extends js.Object {
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.native
}

object WritingOptions {
  @scala.inline
  def apply(): WritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritingOptions]
  }
  @scala.inline
  implicit class WritingOptionsOps[Self <: WritingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: EncodingType | utf8 | base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
  }
  
}

