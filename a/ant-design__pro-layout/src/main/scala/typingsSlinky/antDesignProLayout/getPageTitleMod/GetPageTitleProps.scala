package typingsSlinky.antDesignProLayout.getPageTitleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProLayout.AnonDefaultMessage
import typingsSlinky.antDesignProLayout.AnonDefaultOpenAll
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPageTitleProps extends js.Object {
  var breadcrumb: js.UndefOr[StringDictionary[MenuDataItem]] = js.native
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  var formatMessage: js.UndefOr[js.Function1[/* data */ AnonDefaultMessage, String]] = js.native
  var menu: js.UndefOr[AnonDefaultOpenAll] = js.native
  var pageName: js.UndefOr[String] = js.native
  var pathname: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object GetPageTitleProps {
  @scala.inline
  def apply(): GetPageTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPageTitleProps]
  }
  @scala.inline
  implicit class GetPageTitlePropsOps[Self <: GetPageTitleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadcrumb(value: StringDictionary[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadcrumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumb")(js.undefined)
        ret
    }
    @scala.inline
    def withBreadcrumbMap(value: Map[String, MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadcrumbMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbMap")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMessage(value: /* data */ AnonDefaultMessage => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: AnonDefaultOpenAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withPageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageName")(js.undefined)
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

