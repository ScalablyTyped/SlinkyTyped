package typingsSlinky.materialUiStyles.withStylesWithStylesMod

import typingsSlinky.jss.mod.StyleSheetFactoryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStylesOptions[Theme] extends StyleSheetFactoryOptions {
  var defaultTheme: js.UndefOr[Theme] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object WithStylesOptions {
  @scala.inline
  def apply[Theme](): WithStylesOptions[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions[Theme]]
  }
  @scala.inline
  implicit class WithStylesOptionsOps[Self[theme] <: WithStylesOptions[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withDefaultTheme(value: Theme): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTheme: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWithTheme(value: Boolean): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithTheme: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.undefined)
        ret
    }
  }
  
}

