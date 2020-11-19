package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.mod.SpacingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spacing {
  
  @JSImport("react-elemental", "Spacing")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bottom(value: Boolean): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: Boolean): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: Boolean): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpacingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Spacing.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
