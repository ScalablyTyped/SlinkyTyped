package typingsSlinky.angularCompiler.compileMetadataMod

import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTemplateSummary extends js.Object {
  var animations: js.Array[_] | Null = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var ngContentSelectors: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
}

object CompileTemplateSummary {
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], styles: js.Array[String]): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTemplateSummary]
  }
  @scala.inline
  implicit class CompileTemplateSummaryOps[Self <: CompileTemplateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgContentSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContentSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(null)
        ret
    }
    @scala.inline
    def withEncapsulation(value: ViewEncapsulation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encapsulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncapsulationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encapsulation")(null)
        ret
    }
  }
  
}

