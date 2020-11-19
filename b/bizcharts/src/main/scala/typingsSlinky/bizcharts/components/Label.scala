package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.antvG2.mod.Styles.text
import typingsSlinky.bizcharts.mod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @JSImport("bizcharts", "Label")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Label] {
    
    @scala.inline
    def autoRotate(value: Boolean): this.type = set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(
      value: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
    ): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): this.type = set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def formatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): this.type = set("htmlTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def htmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): this.type = set("htmlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelEmit(value: Boolean): this.type = set("labelEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): this.type = set("labelLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def labelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): this.type = set("labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): this.type = set("textStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def textStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): this.type = set("textStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
