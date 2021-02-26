package typingsSlinky.antDesignProUtils.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProUtils.anon.Label
import typingsSlinky.antd.tooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelIconTip {
  
  @JSImport("@ant-design/pro-utils", "LabelIconTip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: String | TooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LabelIconTip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Label): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
