package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDOMDocumentType extends js.Object {
  @JSName("MSHTML.IDOMDocumentType_typekey")
  var MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType = js.native
  val entities: js.Any = js.native
  val internalSubset: js.Any = js.native
  val name: String = js.native
  val notations: js.Any = js.native
  val publicId: js.Any = js.native
  val systemId: js.Any = js.native
}

object IDOMDocumentType {
  @scala.inline
  def apply(
    MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType,
    entities: js.Any,
    internalSubset: js.Any,
    name: String,
    notations: js.Any,
    publicId: js.Any,
    systemId: js.Any
  ): IDOMDocumentType = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], internalSubset = internalSubset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMDocumentType_typekey")(MSHTMLDotIDOMDocumentType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMDocumentType]
  }
  @scala.inline
  implicit class IDOMDocumentTypeOps[Self <: IDOMDocumentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIDOMDocumentType_typekey(value: IDOMDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IDOMDocumentType_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntities(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalSubset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSubset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

