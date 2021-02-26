package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.FormItemLabelPropsrequire
import typingsSlinky.antd.formFormMod.RequiredMark
import typingsSlinky.antd.formItemLabelMod.LabelTooltipType
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItemLabel {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemLabelPropsrequire]))
  }
  
  @JSImport("antd/lib/form/FormItemLabel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def requiredMark(value: RequiredMark): this.type = set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemLabelPropsrequire): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
