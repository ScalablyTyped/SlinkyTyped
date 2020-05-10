package typingsSlinky.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var background: String = js.native
  var baseFontSize: Double = js.native
  var bgDark: String = js.native
  var bgLight: String = js.native
  var brandColor: String = js.native
  var checkerboardPatternDark: String = js.native
  var checkerboardPatternLight: String = js.native
  var codeColor: String = js.native
  var codeStyles: StringDictionary[StringDictionary[String]] = js.native
  var fontFamily: String = js.native
  var fontHeading: String = js.native
  var fontMono: String = js.native
  var lightColor: String = js.native
  var linkColor: String = js.native
  var msRatio: Double = js.native
  var navBarBackground: String = js.native
  var navBarTextColor: String = js.native
  var pageHeadingBackground: String = js.native
  var pageHeadingHeight: Double = js.native
  var pageHeadingTextColor: String = js.native
  var sidebarColor: String = js.native
  var sidebarColorActive: String = js.native
  var sidebarColorHeading: String = js.native
  var sidebarColorLine: String = js.native
  var sidebarColorText: String = js.native
  var sidebarColorTextActive: String = js.native
  var textColor: String = js.native
}

object Theme {
  @scala.inline
  def apply(
    background: String,
    baseFontSize: Double,
    bgDark: String,
    bgLight: String,
    brandColor: String,
    checkerboardPatternDark: String,
    checkerboardPatternLight: String,
    codeColor: String,
    codeStyles: StringDictionary[StringDictionary[String]],
    fontFamily: String,
    fontHeading: String,
    fontMono: String,
    lightColor: String,
    linkColor: String,
    msRatio: Double,
    navBarBackground: String,
    navBarTextColor: String,
    pageHeadingBackground: String,
    pageHeadingHeight: Double,
    pageHeadingTextColor: String,
    sidebarColor: String,
    sidebarColorActive: String,
    sidebarColorHeading: String,
    sidebarColorLine: String,
    sidebarColorText: String,
    sidebarColorTextActive: String,
    textColor: String
  ): Theme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], bgDark = bgDark.asInstanceOf[js.Any], bgLight = bgLight.asInstanceOf[js.Any], brandColor = brandColor.asInstanceOf[js.Any], checkerboardPatternDark = checkerboardPatternDark.asInstanceOf[js.Any], checkerboardPatternLight = checkerboardPatternLight.asInstanceOf[js.Any], codeColor = codeColor.asInstanceOf[js.Any], codeStyles = codeStyles.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontHeading = fontHeading.asInstanceOf[js.Any], fontMono = fontMono.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], msRatio = msRatio.asInstanceOf[js.Any], navBarBackground = navBarBackground.asInstanceOf[js.Any], navBarTextColor = navBarTextColor.asInstanceOf[js.Any], pageHeadingBackground = pageHeadingBackground.asInstanceOf[js.Any], pageHeadingHeight = pageHeadingHeight.asInstanceOf[js.Any], pageHeadingTextColor = pageHeadingTextColor.asInstanceOf[js.Any], sidebarColor = sidebarColor.asInstanceOf[js.Any], sidebarColorActive = sidebarColorActive.asInstanceOf[js.Any], sidebarColorHeading = sidebarColorHeading.asInstanceOf[js.Any], sidebarColorLine = sidebarColorLine.asInstanceOf[js.Any], sidebarColorText = sidebarColorText.asInstanceOf[js.Any], sidebarColorTextActive = sidebarColorTextActive.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def withBaseFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrandColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckerboardPatternDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckerboardPatternLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkerboardPatternLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontMono(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontMono")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavBarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavBarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageHeadingBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageHeadingHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageHeadingTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeadingTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColorActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColorHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColorLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarColorTextActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarColorTextActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

