package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animations extends js.Object {
  var animations: js.Array[_] = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var externalStylesheets: js.Array[CompileStylesheetMetadata] = js.native
  var htmlAst: ParseTreeResult | Null = js.native
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  var isInline: Boolean = js.native
  var ngContentSelectors: js.Array[String] = js.native
  var preserveWhitespaces: Boolean = js.native
  var styleUrls: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
  var template: String | Null = js.native
  var templateUrl: String | Null = js.native
}

object Animations {
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Animations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], externalStylesheets = externalStylesheets.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  @scala.inline
  implicit class AnimationsOps[Self <: Animations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalStylesheets(value: js.Array[CompileStylesheetMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalStylesheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgContentSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContentSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withHtmlAst(value: ParseTreeResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlAstNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAst")(null)
        ret
    }
    @scala.inline
    def withInterpolation(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(null)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(null)
        ret
    }
  }
  
}

