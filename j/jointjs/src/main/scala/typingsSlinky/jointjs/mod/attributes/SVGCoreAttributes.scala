package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGCoreAttributes extends js.Object {
  var id: js.UndefOr[String] = js.native
  var tabindex: js.UndefOr[Double] = js.native
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.native
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[String] = js.native
  @JSName("xml:space")
  var xmlColonspace: js.UndefOr[String] = js.native
}

object SVGCoreAttributes {
  @scala.inline
  def apply(): SVGCoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCoreAttributes]
  }
  @scala.inline
  implicit class SVGCoreAttributesOps[Self <: SVGCoreAttributes] (val x: Self) extends AnyVal {
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
    def withTabindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlColonbase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlColonbase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:base")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlColonlang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlColonlang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:lang")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlColonspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlColonspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml:space")(js.undefined)
        ret
    }
  }
  
}

