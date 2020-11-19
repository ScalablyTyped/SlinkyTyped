package typingsSlinky.rcRate.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcRate.starMod.StarProps
import typingsSlinky.rcRate.starMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Star {
  
  @JSImport("rc-rate/es/Star", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def allowHalf(value: Boolean): this.type = set("allowHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def character(value: StarProps => ReactElement): this.type = set("character", js.Any.fromFunction1(value))
    
    @scala.inline
    def characterRender(value: (/* origin */ ReactElement, StarProps) => ReactElement): this.type = set("characterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticKeyboardEvent[HTMLDivElement], /* index */ Double) => Unit
    ): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHover(value: (/* e */ SyntheticMouseEvent[HTMLDivElement], /* index */ Double) => Unit): this.type = set("onHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Star.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
