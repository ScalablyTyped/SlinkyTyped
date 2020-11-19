package typingsSlinky.reactTextTruncate.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTextTruncate.mod.TextTruncateProps
import typingsSlinky.reactTextTruncate.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTextTruncate {
  
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def element(value: String): this.type = set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def line(value: Double | Boolean): this.type = set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxCalculateTimes(value: Double): this.type = set("maxCalculateTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCalculated(value: () => Unit): this.type = set("onCalculated", js.Any.fromFunction0(value))
    
    @scala.inline
    def onToggled(value: /* truncated */ Boolean => Unit): this.type = set("onToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTruncated(value: () => Unit): this.type = set("onTruncated", js.Any.fromFunction0(value))
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textElementReactElement(value: ReactElement): this.type = set("textElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textElement(value: ReactElement): this.type = set("textElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTruncateChildReactElement(value: ReactElement): this.type = set("textTruncateChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTruncateChild(value: ReactElement): this.type = set("textTruncateChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def truncateText(value: String): this.type = set("truncateText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextTruncateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactTextTruncate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
