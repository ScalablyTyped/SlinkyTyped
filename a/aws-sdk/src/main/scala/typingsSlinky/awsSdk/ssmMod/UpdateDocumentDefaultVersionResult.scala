package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentDefaultVersionResult extends js.Object {
  /**
    * The description of a custom document that you want to set as the default version.
    */
  var Description: js.UndefOr[DocumentDefaultVersionDescription] = js.native
}

object UpdateDocumentDefaultVersionResult {
  @scala.inline
  def apply(): UpdateDocumentDefaultVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
  }
  @scala.inline
  implicit class UpdateDocumentDefaultVersionResultOps[Self <: UpdateDocumentDefaultVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: DocumentDefaultVersionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

