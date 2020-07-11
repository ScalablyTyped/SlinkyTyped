package typingsSlinky.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends Directive {
  var animations: js.UndefOr[js.Array[_]] = js.undefined
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.undefined
}

object Component {
  @scala.inline
  def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
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
    def setAnimationsVarargs(value: js.Any*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = this.set("changeDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeDetection: Self = this.set("changeDetection", js.undefined)
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncapsulation: Self = this.set("encapsulation", js.undefined)
    @scala.inline
    def setEntryComponentsVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("entryComponents", js.Array(value :_*))
    @scala.inline
    def setEntryComponents(value: js.Array[Type | js.Array[_]]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryComponents: Self = this.set("entryComponents", js.undefined)
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleUrls: Self = this.set("styleUrls", js.undefined)
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setViewProvidersVarargs(value: Provider*): Self = this.set("viewProviders", js.Array(value :_*))
    @scala.inline
    def setViewProviders(value: js.Array[Provider]): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewProviders: Self = this.set("viewProviders", js.undefined)
  }
  
}

