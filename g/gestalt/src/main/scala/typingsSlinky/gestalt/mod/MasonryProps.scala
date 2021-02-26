package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.gestalt.anon.Data
import typingsSlinky.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsSlinky.gestalt.gestaltStrings.MasonryUniformRowLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasonryProps[T] extends StObject {
  
  var columnWidth: js.UndefOr[Double] = js.native
  
  var comp: ReactComponentClass[Data[T]] = js.native
  
  var flexible: js.UndefOr[Boolean] = js.native
  
  var gutterWidth: js.UndefOr[Double] = js.native
  
  var items: js.Array[T] = js.native
  
  var layout: js.UndefOr[MasonryDefaultLayout | MasonryUniformRowLayout] = js.native
  
  var loadItems: js.UndefOr[js.Function0[Unit]] = js.native
  
  var measurementStore: js.UndefOr[js.Any] = js.native
  
  var minCols: js.UndefOr[Double] = js.native
  
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var virtualBoundsBottom: js.UndefOr[Double] = js.native
  
  var virtualBoundsTop: js.UndefOr[Double] = js.native
  
  var virtualize: js.UndefOr[Boolean] = js.native
}
object MasonryProps {
  
  @scala.inline
  def apply[T](comp: ReactComponentClass[Data[T]], items: js.Array[T]): MasonryProps[T] = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps[T]]
  }
  
  @scala.inline
  implicit class MasonryPropsMutableBuilder[Self <: MasonryProps[_], T] (val x: Self with MasonryProps[T]) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setComp(value: ReactComponentClass[Data[T]]): Self = StObject.set(x, "comp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexible(value: Boolean): Self = StObject.set(x, "flexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexibleUndefined: Self = StObject.set(x, "flexible", js.undefined)
    
    @scala.inline
    def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: MasonryDefaultLayout | MasonryUniformRowLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLoadItems(value: () => Unit): Self = StObject.set(x, "loadItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadItemsUndefined: Self = StObject.set(x, "loadItems", js.undefined)
    
    @scala.inline
    def setMeasurementStore(value: js.Any): Self = StObject.set(x, "measurementStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementStoreUndefined: Self = StObject.set(x, "measurementStore", js.undefined)
    
    @scala.inline
    def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
    
    @scala.inline
    def setScrollContainer(value: () => HTMLElement): Self = StObject.set(x, "scrollContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
    
    @scala.inline
    def setVirtualBoundsBottom(value: Double): Self = StObject.set(x, "virtualBoundsBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualBoundsBottomUndefined: Self = StObject.set(x, "virtualBoundsBottom", js.undefined)
    
    @scala.inline
    def setVirtualBoundsTop(value: Double): Self = StObject.set(x, "virtualBoundsTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualBoundsTopUndefined: Self = StObject.set(x, "virtualBoundsTop", js.undefined)
    
    @scala.inline
    def setVirtualize(value: Boolean): Self = StObject.set(x, "virtualize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizeUndefined: Self = StObject.set(x, "virtualize", js.undefined)
  }
}
