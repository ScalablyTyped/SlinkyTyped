package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */
@js.native
trait DocumentData extends js.Object {
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyData] = js.native
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.native
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var sections: js.UndefOr[js.Array[SectionData]] = js.native
}

object DocumentData {
  @scala.inline
  def apply(): DocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentData]
  }
  @scala.inline
  implicit class DocumentDataOps[Self <: DocumentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: BodyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withContentControls(value: js.Array[ContentControlData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentControls")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: DocumentPropertiesData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSaved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(js.undefined)
        ret
    }
    @scala.inline
    def withSections(value: js.Array[SectionData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
  }
  
}

