package typingsSlinky.inboxsdk.mod.Router

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionDescriptor extends js.Object {
  var contentElement: js.UndefOr[HTMLElement] = js.native
  var footerLinkText: js.UndefOr[String] = js.native
  var hasDropdown: js.UndefOr[Boolean] = js.native
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.native
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.native
  var title: String = js.native
  var titleLinkText: js.UndefOr[String] = js.native
}

object SectionDescriptor {
  @scala.inline
  def apply(title: String): SectionDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDescriptor]
  }
  @scala.inline
  implicit class SectionDescriptorOps[Self <: SectionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLinkText")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownClick(value: /* event */ SectionDropdownClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFooterLinkClick(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFooterLinkClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFooterLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFooterLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleLinkClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleLinkClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTitleLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRows(value: js.Array[RowDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLinkText")(js.undefined)
        ret
    }
  }
  
}

