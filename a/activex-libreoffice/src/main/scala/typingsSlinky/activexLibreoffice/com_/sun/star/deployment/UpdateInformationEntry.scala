package typingsSlinky.activexLibreoffice.com_.sun.star.deployment

import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this type are used as elements of the enumeration returned by {@link XUpdateInformationProvider} .
  * @since OOo 2.3
  */
@js.native
trait UpdateInformationEntry extends js.Object {
  /** the (optional) description for an update information entry extracted from the update feed container */
  var Description: String = js.native
  /** the DOM representation of an update information entry */
  var UpdateDocument: XElement = js.native
}

object UpdateInformationEntry {
  @scala.inline
  def apply(Description: String, UpdateDocument: XElement): UpdateInformationEntry = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], UpdateDocument = UpdateDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInformationEntry]
  }
  @scala.inline
  implicit class UpdateInformationEntryOps[Self <: UpdateInformationEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDocument(value: XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

