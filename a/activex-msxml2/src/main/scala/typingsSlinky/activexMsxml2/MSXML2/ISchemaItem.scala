package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item */
@js.native
trait ISchemaItem extends js.Object {
  @JSName("MSXML2.ISchemaItem_typekey")
  var MSXML2DotISchemaItem_typekey: ISchemaItem = js.native
  val id: String = js.native
  val itemType: SOMITEMTYPE = js.native
  val name: String = js.native
  val namespaceURI: String = js.native
  val schema: ISchema = js.native
  val unhandledAttributes: IVBSAXAttributes = js.native
  def writeAnnotation(annotationSink: js.Any): Boolean = js.native
}

object ISchemaItem {
  @scala.inline
  def apply(
    MSXML2DotISchemaItem_typekey: ISchemaItem,
    id: String,
    itemType: SOMITEMTYPE,
    name: String,
    namespaceURI: String,
    schema: ISchema,
    unhandledAttributes: IVBSAXAttributes,
    writeAnnotation: js.Any => Boolean
  ): ISchemaItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], unhandledAttributes = unhandledAttributes.asInstanceOf[js.Any], writeAnnotation = js.Any.fromFunction1(writeAnnotation))
    __obj.updateDynamic("MSXML2.ISchemaItem_typekey")(MSXML2DotISchemaItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchemaItem]
  }
  @scala.inline
  implicit class ISchemaItemOps[Self <: ISchemaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotISchemaItem_typekey(value: ISchemaItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.ISchemaItem_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemType(value: SOMITEMTYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: ISchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandledAttributes(value: IVBSAXAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteAnnotation(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAnnotation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

