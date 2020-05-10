package typingsSlinky.catalog

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<catalog.catalog.Theme> */
@js.native
trait PartialTheme extends js.Object {
  var background: js.UndefOr[String] = js.native
  var baseFontSize: js.UndefOr[Double] = js.native
  var bgDark: js.UndefOr[String] = js.native
  var bgLight: js.UndefOr[String] = js.native
  var brandColor: js.UndefOr[String] = js.native
  var checkerboardPatternDark: js.UndefOr[String] = js.native
  var checkerboardPatternLight: js.UndefOr[String] = js.native
  var codeColor: js.UndefOr[String] = js.native
  var codeStyles: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontHeading: js.UndefOr[String] = js.native
  var fontMono: js.UndefOr[String] = js.native
  var lightColor: js.UndefOr[String] = js.native
  var linkColor: js.UndefOr[String] = js.native
  var msRatio: js.UndefOr[Double] = js.native
  var navBarBackground: js.UndefOr[String] = js.native
  var navBarTextColor: js.UndefOr[String] = js.native
  var pageHeadingBackground: js.UndefOr[String] = js.native
  var pageHeadingHeight: js.UndefOr[Double] = js.native
  var pageHeadingTextColor: js.UndefOr[String] = js.native
  var sidebarColor: js.UndefOr[String] = js.native
  var sidebarColorActive: js.UndefOr[String] = js.native
  var sidebarColorHeading: js.UndefOr[String] = js.native
  var sidebarColorLine: js.UndefOr[String] = js.native
  var sidebarColorText: js.UndefOr[String] = js.native
  var sidebarColorTextActive: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object PartialTheme {
  @scala.inline
  def apply(): PartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTheme]
  }
  @scala.inline
  implicit class PartialThemeOps[Self <: PartialTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBgDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgDark")(js.undefined)
        ret
    }
    @scala.inline
    def withBgLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLight")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckerboardPatternDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckerboardPatternDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternDark")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckerboardPatternLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckerboardPatternLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternLight")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withFontMono(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontMono")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontMono: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontMono")(js.undefined)
        ret
    }
    @scala.inline
    def withLightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMsRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavBarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavBarTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeadingBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeadingBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeadingHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeadingHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeadingTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeadingTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColorActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColorActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorActive")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColorHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColorHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColorLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColorLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorText")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarColorTextActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorTextActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarColorTextActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorTextActive")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

