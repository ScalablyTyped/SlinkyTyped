package typingsSlinky.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML EntityReference node.
  */
@js.native
trait EntityRef extends Content {
  def getName(): String = js.native
  def getPublicId(): String = js.native
  def getSystemId(): String = js.native
  def setName(name: String): EntityRef = js.native
  def setPublicId(id: String): EntityRef = js.native
  def setSystemId(id: String): EntityRef = js.native
}

object EntityRef {
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
    getName: () => String,
    getParentElement: () => Element,
    getPublicId: () => String,
    getSystemId: () => String,
    getType: () => ContentType,
    getValue: () => String,
    setName: String => EntityRef,
    setPublicId: String => EntityRef,
    setSystemId: String => EntityRef
  ): EntityRef = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getName = js.Any.fromFunction0(getName), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
    __obj.asInstanceOf[EntityRef]
  }
  @scala.inline
  implicit class EntityRefOps[Self <: EntityRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
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
    def withSetName(value: String => EntityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPublicId(value: String => EntityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPublicId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSystemId(value: String => EntityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSystemId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

