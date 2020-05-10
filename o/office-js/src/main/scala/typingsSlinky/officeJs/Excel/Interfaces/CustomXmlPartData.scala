package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customXmlPart.toJSON()`. */
@js.native
trait CustomXmlPartData extends js.Object {
  /**
    *
    * The custom XML part's ID. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * The custom XML part's namespace URI. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[String] = js.native
}

object CustomXmlPartData {
  @scala.inline
  def apply(): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartData]
  }
  @scala.inline
  implicit class CustomXmlPartDataOps[Self <: CustomXmlPartData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceUri")(js.undefined)
        ret
    }
  }
  
}

