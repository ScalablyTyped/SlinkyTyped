package typingsSlinky.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAttributes extends js.Object {
  var prefixedAttributes: js.UndefOr[js.Array[PrefixedXmlAttributes]] = js.native
  var rawMap: js.UndefOr[js.Any] = js.native
}

object XmlAttributes {
  @scala.inline
  def apply(): XmlAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlAttributes]
  }
  @scala.inline
  implicit class XmlAttributesOps[Self <: XmlAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixedAttributes(value: js.Array[PrefixedXmlAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRawMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMap")(js.undefined)
        ret
    }
  }
  
}

