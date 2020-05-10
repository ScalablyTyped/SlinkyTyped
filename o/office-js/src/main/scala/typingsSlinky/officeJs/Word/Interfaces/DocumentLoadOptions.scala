package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait DocumentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates that, when opening a new document, whether it is allowed to close this document even if this document is untitled. True to close, false otherwise.
    *
    * [Api set: WordApi]
    */
  var allowCloseOnUntitled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.native
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[Boolean] = js.native
}

object DocumentLoadOptions {
  @scala.inline
  def apply(): DocumentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLoadOptions]
  }
  @scala.inline
  implicit class DocumentLoadOptionsOps[Self <: DocumentLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCloseOnUntitled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCloseOnUntitled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCloseOnUntitled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCloseOnUntitled")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: BodyLoadOptions): Self = {
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
    def withProperties(value: DocumentPropertiesLoadOptions): Self = {
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
  }
  
}

