package typingsSlinky.reactFlagIconCss.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.Properties
import typingsSlinky.csstype.mod.PropertiesHyphen
import typingsSlinky.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagIconOptions extends js.Object {
  /**
    * An object literal whose keys are your custom codes.
    */
  var customCodes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
    * using .theme-base and/or b) you are using custom flags.
    */
  var themeStyles: js.UndefOr[
    StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
  ] = js.native
  /**
    * Use CSS modules styles (your module bundler must be correctly setup).
    */
  var useCssModules: js.UndefOr[Boolean] = js.native
}

object FlagIconOptions {
  @scala.inline
  def apply(): FlagIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagIconOptions]
  }
  @scala.inline
  implicit class FlagIconOptionsOps[Self <: FlagIconOptions] (val x: Self) extends AnyVal {
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

