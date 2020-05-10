package typingsSlinky.reactFlagIconCss

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.Properties
import typingsSlinky.csstype.mod.PropertiesHyphen
import typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-flag-icon-css.react-flag-icon-css.FlagIconOptions> */
@js.native
trait ReadonlyFlagIconOptions extends js.Object {
  val customCodes: js.UndefOr[StringDictionary[String]] = js.native
  val themeStyles: js.UndefOr[
    StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
  ] = js.native
  val useCssModules: js.UndefOr[Boolean] = js.native
}

object ReadonlyFlagIconOptions {
  @scala.inline
  def apply(): ReadonlyFlagIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFlagIconOptions]
  }
  @scala.inline
  implicit class ReadonlyFlagIconOptionsOps[Self <: ReadonlyFlagIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomCodes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeStyles(value: StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCssModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCssModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssModules")(js.undefined)
        ret
    }
  }
  
}

