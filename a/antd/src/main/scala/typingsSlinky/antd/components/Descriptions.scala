package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.PartialRecordBreakpointnu
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.middle
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.descriptionsMod.DescriptionsProps
import typingsSlinky.antd.itemMod.DescriptionsItemProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Descriptions {
  
  @JSImport("antd", "Descriptions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def column(value: Double | PartialRecordBreakpointnu): this.type = set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: middle | small | default): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DescriptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Descriptions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Item {
    
    @JSImport("antd", "Descriptions.Item")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DescriptionsItemProps): typingsSlinky.antd.components.Descriptions.Item.Builder = new typingsSlinky.antd.components.Descriptions.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): typingsSlinky.antd.components.Descriptions.Item.Builder = new typingsSlinky.antd.components.Descriptions.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
