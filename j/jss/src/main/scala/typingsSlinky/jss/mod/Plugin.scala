package typingsSlinky.jss.mod

import typingsSlinky.jss.jssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.native
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions, Rule]
  ] = js.native
  var onProcessRule: js.UndefOr[
    js.Function2[
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.native
  var onProcessSheet: js.UndefOr[
    js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
  ] = js.native
  var onProcessStyle: js.UndefOr[
    js.Function3[
      /* style */ JssStyle, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      JssStyle
    ]
  ] = js.native
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChangeValue(value: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChangeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateRule(value: (/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions) => Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateRule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCreateRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateRule")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProcessRule(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessRule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnProcessRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessRule")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProcessSheet(value: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProcessSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProcessStyle(
      value: (/* style */ JssStyle, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessStyle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnProcessStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProcessStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(
      value: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
  }
  
}

