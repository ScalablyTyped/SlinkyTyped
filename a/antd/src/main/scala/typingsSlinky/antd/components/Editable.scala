package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.editableMod.EditableProps
import typingsSlinky.rcTextarea.resizableTextAreaMod.AutoSizeType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editable {
  
  @scala.inline
  def apply(onCancel: () => Unit, onSave: String => Unit, value: String): Builder = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EditableProps]))
  }
  
  @JSImport("antd/lib/typography/Editable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSize(value: Boolean | AutoSizeType): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EditableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
