package typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod

import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesOptions extends js.Object {
  var disableGeneration: js.UndefOr[Boolean] = js.native
  var generateClassName: js.UndefOr[GenerateId] = js.native
  var injectFirst: js.UndefOr[Boolean] = js.native
  var jss: js.UndefOr[Jss] = js.native
  // TODO need info @oliviertassinari
  var sheetsCache: js.UndefOr[js.Object] = js.native
  // TODO need info @oliviertassinari
  var sheetsManager: js.UndefOr[js.Object] = js.native
  // TODO need info @oliviertassinari
  var sheetsRegistry: js.UndefOr[js.Object] = js.native
}

object StylesOptions {
  @scala.inline
  def apply(): StylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesOptions]
  }
  @scala.inline
  implicit class StylesOptionsOps[Self <: StylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableGeneration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withJss(value: Jss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsCache(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsManager(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsManager")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsRegistry(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsRegistry")(js.undefined)
        ret
    }
  }
  
}

