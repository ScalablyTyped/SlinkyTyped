package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsSlinky.antDesignPro.tagSelectOptionMod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagSelectOption {
  
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* value */ String | Double, /* state */ Boolean) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TagSelectOption.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TagSelectOptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
