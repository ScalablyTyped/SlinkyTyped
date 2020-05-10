package typingsSlinky.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML DocumentType node.
  */
@js.native
trait DocType extends Content {
  def getElementName(): String = js.native
  def getInternalSubset(): String = js.native
  def getPublicId(): String = js.native
  def getSystemId(): String = js.native
  def setElementName(name: String): DocType = js.native
  def setInternalSubset(data: String): DocType = js.native
  def setPublicId(id: String): DocType = js.native
  def setSystemId(id: String): DocType = js.native
}

object DocType {
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
    getElementName: () => String,
    getInternalSubset: () => String,
    getParentElement: () => Element,
    getPublicId: () => String,
    getSystemId: () => String,
    getType: () => ContentType,
    getValue: () => String,
    setElementName: String => DocType,
    setInternalSubset: String => DocType,
    setPublicId: String => DocType,
    setSystemId: String => DocType
  ): DocType = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getElementName = js.Any.fromFunction0(getElementName), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setElementName = js.Any.fromFunction1(setElementName), setInternalSubset = js.Any.fromFunction1(setInternalSubset), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
    __obj.asInstanceOf[DocType]
  }
  @scala.inline
  implicit class DocTypeOps[Self <: DocType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElementName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInternalSubset(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInternalSubset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPublicId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSystemId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSystemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetElementName(value: String => DocType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElementName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInternalSubset(value: String => DocType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInternalSubset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPublicId(value: String => DocType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPublicId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSystemId(value: String => DocType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSystemId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

