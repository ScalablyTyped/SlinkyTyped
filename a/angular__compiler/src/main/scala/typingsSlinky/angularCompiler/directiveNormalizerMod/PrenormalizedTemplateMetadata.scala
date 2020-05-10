package typingsSlinky.angularCompiler.directiveNormalizerMod

import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrenormalizedTemplateMetadata extends js.Object {
  var animations: js.Array[_] = js.native
  var componentType: js.Any = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  var moduleUrl: String = js.native
  var ngModuleType: js.Any = js.native
  var preserveWhitespaces: Boolean | Null = js.native
  var styleUrls: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
  var template: String | Null = js.native
  var templateUrl: String | Null = js.native
}

object PrenormalizedTemplateMetadata {
  @scala.inline
  def apply(
    animations: js.Array[_],
    componentType: js.Any,
    moduleUrl: String,
    ngModuleType: js.Any,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): PrenormalizedTemplateMetadata = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], moduleUrl = moduleUrl.asInstanceOf[js.Any], ngModuleType = ngModuleType.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrenormalizedTemplateMetadata]
  }
  @scala.inline
  implicit class PrenormalizedTemplateMetadataOps[Self <: PrenormalizedTemplateMetadata] (val x: Self) extends AnyVal {
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
    def withComponentType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModuleType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModuleType")(value.asInstanceOf[js.Any])
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
    def withPreserveWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveWhitespacesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(null)
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

