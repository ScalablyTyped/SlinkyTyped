package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep a startElement/endElement SAX event. */
@js.native
trait ElementStackItem extends js.Object {
  /** the name of the element */
  var elementName: String = js.native
  /** whether it is a startElement event */
  var isStartElementEvent: Boolean = js.native
  /** attribute list for a startElement event */
  var xAttributes: XAttributeList = js.native
}

object ElementStackItem {
  @scala.inline
  def apply(elementName: String, isStartElementEvent: Boolean, xAttributes: XAttributeList): ElementStackItem = {
    val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], isStartElementEvent = isStartElementEvent.asInstanceOf[js.Any], xAttributes = xAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStackItem]
  }
  @scala.inline
  implicit class ElementStackItemOps[Self <: ElementStackItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStartElementEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartElementEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAttributes(value: XAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

