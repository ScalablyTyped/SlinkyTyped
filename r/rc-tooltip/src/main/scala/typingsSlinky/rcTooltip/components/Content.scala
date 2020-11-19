package typingsSlinky.rcTooltip.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTooltip.contentMod.ContentProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Content {
  
  @JSImport("rc-tooltip/es/Content", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def overlay(value: js.Function0[ReactElement] | ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ContentProps]))
  }
}
