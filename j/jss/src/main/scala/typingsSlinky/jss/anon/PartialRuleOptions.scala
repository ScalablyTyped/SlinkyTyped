package typingsSlinky.jss.anon

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
trait PartialRuleOptions extends js.Object {
  var Renderer: js.UndefOr[typingsSlinky.jss.mod.Renderer] = js.undefined
  var classes: js.UndefOr[Classes[String]] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("Renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("Renderer", js.undefined)
    @scala.inline
    def setClasses(value: Classes[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = this.set("generateId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
    @scala.inline
    def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = this.set("sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
  }
  
}

