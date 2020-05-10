package typingsSlinky.jss

import typingsSlinky.jss.mod.Classes
import typingsSlinky.jss.mod.ContainerRule
import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Renderer
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.RuleOptions> */
@js.native
trait PartialRuleOptions extends js.Object {
  var Renderer: js.UndefOr[typingsSlinky.jss.mod.Renderer] = js.native
  var classes: js.UndefOr[Classes[String]] = js.native
  var generateId: js.UndefOr[GenerateId] = js.native
  var index: js.UndefOr[Double] = js.native
  var jss: js.UndefOr[Jss] = js.native
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.native
  var selector: js.UndefOr[String] = js.native
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
}

object PartialRuleOptions {
  @scala.inline
  def apply(): PartialRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRuleOptions]
  }
  @scala.inline
  implicit class PartialRuleOptionsOps[Self <: PartialRuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Classes[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateId")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
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
    def withParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet(value: StyleSheet[String | Double | js.Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(js.undefined)
        ret
    }
  }
  
}

