package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.CollapseText
import typingsSlinky.antDesignPro.tagSelectMod.TagSelectProps
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagSelect {
  
  @scala.inline
  def apply(Option: TagSelectOptionProps, children: ReactElement | js.Array[ReactElement], className: String): Builder = {
    val __props = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagSelectProps]))
  }
  
  @JSImport("ant-design-pro", "TagSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.TagSelect] {
    
    @scala.inline
    def actionsText(value: CollapseText): this.type = set("actionsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideCheckAll(value: Boolean): this.type = set("hideCheckAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ js.Array[String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[Double | String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: (Double | String)*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps(p: TagSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
