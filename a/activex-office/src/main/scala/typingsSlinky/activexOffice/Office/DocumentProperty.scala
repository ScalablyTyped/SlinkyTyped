package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentProperty[TApplication] extends js.Object {
  var Application: TApplication = js.native
  var Creator: Double = js.native
  var LinkSource: String = js.native
  var LinkToContent: Boolean = js.native
  var Name: String = js.native
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication] = js.native
  var Parent: js.Any = js.native
  var Type: MsoDocProperties = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
}

object DocumentProperty {
  @scala.inline
  def apply[TApplication](
    Application: TApplication,
    Creator: Double,
    Delete: () => Unit,
    LinkSource: String,
    LinkToContent: Boolean,
    Name: String,
    OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication],
    Parent: js.Any,
    Type: MsoDocProperties,
    Value: js.Any
  ): DocumentProperty[TApplication] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), LinkSource = LinkSource.asInstanceOf[js.Any], LinkToContent = LinkToContent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentProperty_typekey")(OfficeDotDocumentProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProperty[TApplication]]
  }
  @scala.inline
  implicit class DocumentPropertyOps[Self[tapplication] <: DocumentProperty[tapplication], TApplication] (val x: Self[TApplication]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TApplication] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TApplication]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TApplication] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TApplication] with Other]
    @scala.inline
    def withApplication(value: TApplication): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLinkSource(value: String): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkToContent(value: Boolean): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkToContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotDocumentProperty_typekey(value: DocumentProperty[TApplication]): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.DocumentProperty_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoDocProperties): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self[TApplication] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

