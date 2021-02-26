package typingsSlinky.atlaskitLayer.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitLayer.mod.BoundariesElementType
import typingsSlinky.atlaskitLayer.mod.CSSPositionType
import typingsSlinky.atlaskitLayer.mod.FlipPositionType
import typingsSlinky.atlaskitLayer.mod.PositionType
import typingsSlinky.atlaskitLayer.mod.Props
import typingsSlinky.atlaskitLayer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): this.type = set("autoFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFlipVarargs(value: FlipPositionType*): this.type = set("autoFlip", js.Array(value :_*))
    
    @scala.inline
    def boundariesElement(value: BoundariesElementType): this.type = set("boundariesElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lockScroll(value: Boolean): this.type = set("lockScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: String): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFlippedChange(
      value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit
    ): this.type = set("onFlippedChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Layer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
