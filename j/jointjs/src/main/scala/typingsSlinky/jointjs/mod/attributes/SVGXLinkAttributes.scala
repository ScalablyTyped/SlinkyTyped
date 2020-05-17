package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGXLinkAttributes extends js.Object {
  @JSName("xlink:actuate")
  var xlinkColonactuate: js.UndefOr[String] = js.native
  @JSName("xlink:arcrole")
  var xlinkColonarcrole: js.UndefOr[String] = js.native
  @JSName("xlink:href")
  var xlinkColonhref: js.UndefOr[String] = js.native
  @JSName("xlink:role")
  var xlinkColonrole: js.UndefOr[String] = js.native
  @JSName("xlink:show")
  var xlinkColonshow: js.UndefOr[String] = js.native
  @JSName("xlink:title")
  var xlinkColontitle: js.UndefOr[String] = js.native
  @JSName("xlink:type")
  var xlinkColontype: js.UndefOr[String] = js.native
}

object SVGXLinkAttributes {
  @scala.inline
  def apply(): SVGXLinkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGXLinkAttributes]
  }
  @scala.inline
  implicit class SVGXLinkAttributesOps[Self <: SVGXLinkAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXlinkColonactuate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:actuate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColonactuate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:actuate")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColonarcrole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:arcrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColonarcrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:arcrole")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColonhref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColonhref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:href")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColonrole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColonrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:role")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColonshow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColonshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:show")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColontitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColontitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:title")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkColontype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkColontype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink:type")(js.undefined)
        ret
    }
  }
  
}

