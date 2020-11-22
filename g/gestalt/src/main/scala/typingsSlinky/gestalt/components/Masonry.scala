package typingsSlinky.gestalt.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Data
import typingsSlinky.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsSlinky.gestalt.gestaltStrings.MasonryUniformRowLayout
import typingsSlinky.gestalt.mod.MasonryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Masonry {
  
  @JSImport("gestalt", "Masonry")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Masonry] {
    
    @scala.inline
    def columnWidth(value: Double): this.type = set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexible(value: Boolean): this.type = set("flexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: MasonryDefaultLayout | MasonryUniformRowLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadItems(value: () => Unit): this.type = set("loadItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def measurementStore(value: js.Any): this.type = set("measurementStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minCols(value: Double): this.type = set("minCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollContainer(value: () => HTMLElement): this.type = set("scrollContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def virtualBoundsBottom(value: Double): this.type = set("virtualBoundsBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtualBoundsTop(value: Double): this.type = set("virtualBoundsTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtualize(value: Boolean): this.type = set("virtualize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MasonryProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(comp: ReactComponentClass[Data[js.Any]], items: js.Array[js.Any]): Builder = {
    val __props = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MasonryProps[js.Any]]))
  }
}
