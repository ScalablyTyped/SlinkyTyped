package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.baseline
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.end
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.start
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.spaceMod.SpaceProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Space {
  
  @JSImport("antd", "Space")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: start | end | center | baseline): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType | Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def split(value: ReactElement): this.type = set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def splitReactElement(value: ReactElement): this.type = set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Space.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
