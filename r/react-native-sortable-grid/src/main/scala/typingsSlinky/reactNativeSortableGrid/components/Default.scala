package typingsSlinky.reactNativeSortableGrid.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSortableGrid.anon.Transform
import typingsSlinky.reactNativeSortableGrid.mod.ItemOrder
import typingsSlinky.reactNativeSortableGrid.mod.OrderedItem
import typingsSlinky.reactNativeSortableGrid.mod.SortableGridProps
import typingsSlinky.reactNativeSortableGrid.mod.defaultCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, defaultCls] {
    
    @scala.inline
    def activeBlockCenteringDuration(value: Double): this.type = set("activeBlockCenteringDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockTransitionDuration(value: Double): this.type = set("blockTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def doubleTapTreshold(value: Double): this.type = set("doubleTapTreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragActivationThreshold(value: Double): this.type = set("dragActivationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragStartAnimation(value: Transform): this.type = set("dragStartAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsPerRow(value: Double): this.type = set("itemsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDeleteItem(value: /* deletedItem */ OrderedItem => Unit): this.type = set("onDeleteItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragRelease(value: /* itemOrder */ ItemOrder => Unit): this.type = set("onDragRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* item */ OrderedItem => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Default.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SortableGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
