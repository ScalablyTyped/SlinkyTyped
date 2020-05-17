package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLSchemaReference extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Location: String = js.native
  val NamespaceURI: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.XMLSchemaReference_typekey")
  var WordDotXMLSchemaReference_typekey: XMLSchemaReference = js.native
  def Delete(): Unit = js.native
  def Reload(): Unit = js.native
}

object XMLSchemaReference {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Location: String,
    NamespaceURI: String,
    Parent: js.Any,
    Reload: () => Unit,
    WordDotXMLSchemaReference_typekey: XMLSchemaReference
  ): XMLSchemaReference = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Location = Location.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reload = js.Any.fromFunction0(Reload))
    __obj.updateDynamic("Word.XMLSchemaReference_typekey")(WordDotXMLSchemaReference_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSchemaReference]
  }
  @scala.inline
  implicit class XMLSchemaReferenceOps[Self <: XMLSchemaReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotXMLSchemaReference_typekey(value: XMLSchemaReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.XMLSchemaReference_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

