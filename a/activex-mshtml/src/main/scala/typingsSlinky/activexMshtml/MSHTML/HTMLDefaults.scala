package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDefaults extends js.Object {
  @JSName("MSHTML.HTMLDefaults_typekey")
  var MSHTMLDotHTMLDefaults_typekey: HTMLDefaults = js.native
  var canHaveHTML: Boolean = js.native
  val constructor: js.Any = js.native
  var contentEditable: String = js.native
  var frozen: Boolean = js.native
  var isMultiLine: Boolean = js.native
  var scrollSegmentX: Double = js.native
  var scrollSegmentY: Double = js.native
  val style: IHTMLStyle = js.native
  var tabStop: Boolean = js.native
  var viewInheritStyle: Boolean = js.native
  var viewLink: IHTMLDocument = js.native
  var viewMasterTab: Boolean = js.native
}

object HTMLDefaults {
  @scala.inline
  def apply(
    MSHTMLDotHTMLDefaults_typekey: HTMLDefaults,
    canHaveHTML: Boolean,
    constructor: js.Any,
    contentEditable: String,
    frozen: Boolean,
    isMultiLine: Boolean,
    scrollSegmentX: Double,
    scrollSegmentY: Double,
    style: IHTMLStyle,
    tabStop: Boolean,
    viewInheritStyle: Boolean,
    viewLink: IHTMLDocument,
    viewMasterTab: Boolean
  ): HTMLDefaults = {
    val __obj = js.Dynamic.literal(canHaveHTML = canHaveHTML.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], isMultiLine = isMultiLine.asInstanceOf[js.Any], scrollSegmentX = scrollSegmentX.asInstanceOf[js.Any], scrollSegmentY = scrollSegmentY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabStop = tabStop.asInstanceOf[js.Any], viewInheritStyle = viewInheritStyle.asInstanceOf[js.Any], viewLink = viewLink.asInstanceOf[js.Any], viewMasterTab = viewMasterTab.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDefaults_typekey")(MSHTMLDotHTMLDefaults_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDefaults]
  }
  @scala.inline
  implicit class HTMLDefaultsOps[Self <: HTMLDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLDefaults_typekey(value: HTMLDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLDefaults_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanHaveHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canHaveHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentEditable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollSegmentX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSegmentX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollSegmentY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSegmentY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: IHTMLStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewInheritStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewInheritStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewLink(value: IHTMLDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMasterTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMasterTab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

