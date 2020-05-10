package typingsSlinky.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a generic XML node.
  * Implementing classes
  *
  * NameBrief description
  *
  * CdataA representation of an XML CDATASection node.
  *
  * CommentA representation of an XML Comment node.
  *
  * DocTypeA representation of an XML DocumentType node.
  *
  * ElementA representation of an XML Element node.
  *
  * EntityRefA representation of an XML EntityReference node.
  *
  * ProcessingInstructionA representation of an XML ProcessingInstruction node.
  *
  * TextA representation of an XML Text node.
  */
@js.native
trait Content extends js.Object {
  def asCdata(): Cdata = js.native
  def asComment(): Comment = js.native
  def asDocType(): DocType = js.native
  def asElement(): Element = js.native
  def asEntityRef(): EntityRef = js.native
  def asProcessingInstruction(): ProcessingInstruction = js.native
  def asText(): Text = js.native
  def detach(): Content = js.native
  def getParentElement(): Element = js.native
  def getType(): ContentType = js.native
  def getValue(): String = js.native
}

object Content {
  @scala.inline
  def apply(
    asCdata: () => Cdata,
    asComment: () => Comment,
    asDocType: () => DocType,
    asElement: () => Element,
    asEntityRef: () => EntityRef,
    asProcessingInstruction: () => ProcessingInstruction,
    asText: () => Text,
    detach: () => Content,
    getParentElement: () => Element,
    getType: () => ContentType,
    getValue: () => String
  ): Content = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsCdata(value: () => Cdata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asCdata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsComment(value: () => Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsDocType(value: () => DocType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDocType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsEntityRef(value: () => EntityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asEntityRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsProcessingInstruction(value: () => ProcessingInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asProcessingInstruction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsText(value: () => Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetach(value: () => Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

