package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTag extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val DownloadURL: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Properties: CustomProperties = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val SmartTagActions: typingsSlinky.activexWord.Word.SmartTagActions = js.native
  @JSName("Word.SmartTag_typekey")
  var WordDotSmartTag_typekey: SmartTag = js.native
  val XML: String = js.native
  val XMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object SmartTag {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DownloadURL: String,
    Name: String,
    Parent: js.Any,
    Properties: CustomProperties,
    Range: Range,
    Select: () => Unit,
    SmartTagActions: SmartTagActions,
    WordDotSmartTag_typekey: SmartTag,
    XML: String,
    XMLNode: XMLNode
  ): SmartTag = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DownloadURL = DownloadURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), SmartTagActions = SmartTagActions.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any], XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTag_typekey")(WordDotSmartTag_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTag]
  }
  @scala.inline
  implicit class SmartTagOps[Self <: SmartTag] (val x: Self) extends AnyVal {
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
    def withDownloadURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: CustomProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSmartTagActions(value: SmartTagActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartTagActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSmartTag_typekey(value: SmartTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SmartTag_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

