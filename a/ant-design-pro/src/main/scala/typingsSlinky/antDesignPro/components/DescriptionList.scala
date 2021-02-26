package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.antDesignProStrings.horizontal
import typingsSlinky.antDesignPro.antDesignProStrings.large
import typingsSlinky.antDesignPro.antDesignProStrings.small
import typingsSlinky.antDesignPro.antDesignProStrings.vertical
import typingsSlinky.antDesignPro.descriptionListMod.DescriptionListProps
import typingsSlinky.antDesignPro.descriptionMod.DescriptionProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DescriptionList {
  
  @JSImport("ant-design-pro", "DescriptionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.DescriptionList] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def col(value: Double): this.type = set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: js.Array[DescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionVarargs(value: DescriptionProps*): this.type = set("description", js.Array(value :_*))
    
    @scala.inline
    def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DescriptionList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DescriptionListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
