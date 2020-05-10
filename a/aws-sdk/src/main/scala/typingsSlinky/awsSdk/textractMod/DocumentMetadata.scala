package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadata extends js.Object {
  /**
    * The number of pages that are detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.native
}

object DocumentMetadata {
  @scala.inline
  def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  @scala.inline
  implicit class DocumentMetadataOps[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPages(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(js.undefined)
        ret
    }
  }
  
}

