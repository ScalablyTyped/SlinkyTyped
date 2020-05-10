package typingsSlinky.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocumentType extends js.Object {
  var documentType: String = js.native
  var documentURL: String = js.native
  var isEditable: Boolean = js.native
  var linkURL: js.UndefOr[String] = js.native
  var selectionText: js.UndefOr[String] = js.native
  var srcURL: js.UndefOr[String] = js.native
  var targetID: js.UndefOr[String] = js.native
  var targetName: String = js.native
  var value: js.UndefOr[String] = js.native
}

object AnonDocumentType {
  @scala.inline
  def apply(documentType: String, documentURL: String, isEditable: Boolean, targetName: String): AnonDocumentType = {
    val __obj = js.Dynamic.literal(documentType = documentType.asInstanceOf[js.Any], documentURL = documentURL.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentType]
  }
  @scala.inline
  implicit class AnonDocumentTypeOps[Self <: AnonDocumentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionText")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcURL")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

