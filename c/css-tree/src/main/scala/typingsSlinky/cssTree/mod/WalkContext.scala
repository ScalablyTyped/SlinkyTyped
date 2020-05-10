package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkContext extends js.Object {
  var atrule: Atrule | Null = js.native
  var atrulePrelude: AtrulePrelude | Null = js.native
  var block: Block | Null = js.native
  var declaration: Declaration | Null = js.native
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector | Null = js.native
  var root: CssNode = js.native
  var rule: Rule | Null = js.native
  var selector: SelectorList | Null = js.native
  var stylesheet: StyleSheet | Null = js.native
}

object WalkContext {
  @scala.inline
  def apply(root: CssNode): WalkContext = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkContext]
  }
  @scala.inline
  implicit class WalkContextOps[Self <: WalkContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: CssNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtrule(value: Atrule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atrule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtruleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atrule")(null)
        ret
    }
    @scala.inline
    def withAtrulePrelude(value: AtrulePrelude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atrulePrelude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtrulePreludeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atrulePrelude")(null)
        ret
    }
    @scala.inline
    def withBlock(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(null)
        ret
    }
    @scala.inline
    def withDeclaration(value: Declaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(null)
        ret
    }
    @scala.inline
    def withFunction(value: FunctionNode | PseudoClassSelector | PseudoElementSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(null)
        ret
    }
    @scala.inline
    def withRule(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(null)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(null)
        ret
    }
    @scala.inline
    def withStylesheet(value: StyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylesheetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(null)
        ret
    }
  }
  
}

