package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLPrefixMapping extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val NamespaceURI: String = js.native
  @JSName("Office.CustomXMLPrefixMapping_typekey")
  var OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping = js.native
  val Parent: js.Any = js.native
  val Prefix: String = js.native
}

object CustomXMLPrefixMapping {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    NamespaceURI: String,
    OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping,
    Parent: js.Any,
    Prefix: String
  ): CustomXMLPrefixMapping = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLPrefixMapping_typekey")(OfficeDotCustomXMLPrefixMapping_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLPrefixMapping]
  }
  @scala.inline
  implicit class CustomXMLPrefixMappingOps[Self <: CustomXMLPrefixMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
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
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotCustomXMLPrefixMapping_typekey(value: CustomXMLPrefixMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.CustomXMLPrefixMapping_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

