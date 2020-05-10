package typingsSlinky.awsSdkClientS3Node.typesIndexDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDocument extends js.Object {
  /**
    * <p>A suffix that is appended to a request that is for a directory on the website endpoint (e.g. if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.</p>
    */
  var Suffix: String = js.native
}

object IndexDocument {
  @scala.inline
  def apply(Suffix: String): IndexDocument = {
    val __obj = js.Dynamic.literal(Suffix = Suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocument]
  }
  @scala.inline
  implicit class IndexDocumentOps[Self <: IndexDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Suffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

