package typingsSlinky.reactMeasure.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactMeasure.mod.ContentRect
import typingsSlinky.reactMeasure.mod.MeasureProps
import typingsSlinky.reactMeasure.mod.MeasuredComponentProps
import typingsSlinky.reactMeasure.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMeasure {
  
  @JSImport("react-measure", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def bounds(value: Boolean): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactComponentClass[MeasuredComponentProps]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def client(value: Boolean): this.type = set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[Element]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ Element | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[Element]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def margin(value: Boolean): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Boolean): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResize(value: /* contentRect */ ContentRect => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MeasureProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactMeasure.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
