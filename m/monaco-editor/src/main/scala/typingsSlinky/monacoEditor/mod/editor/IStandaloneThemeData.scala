package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandaloneThemeData extends js.Object {
  var base: BuiltinTheme = js.native
  var colors: IColors = js.native
  var encodedTokensColors: js.UndefOr[js.Array[String]] = js.native
  var inherit: Boolean = js.native
  var rules: js.Array[ITokenThemeRule] = js.native
}

object IStandaloneThemeData {
  @scala.inline
  def apply(base: BuiltinTheme, colors: IColors, inherit: Boolean, rules: js.Array[ITokenThemeRule]): IStandaloneThemeData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandaloneThemeData]
  }
  @scala.inline
  implicit class IStandaloneThemeDataOps[Self <: IStandaloneThemeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: BuiltinTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: IColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[ITokenThemeRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodedTokensColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedTokensColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedTokensColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedTokensColors")(js.undefined)
        ret
    }
  }
  
}

