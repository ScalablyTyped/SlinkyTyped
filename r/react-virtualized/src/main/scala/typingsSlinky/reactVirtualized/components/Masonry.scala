package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.anon.ClientHeight
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryCellProps
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryProps
import typingsSlinky.reactVirtualized.esMasonryMod.Positioner
import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Masonry {
  
  @JSImport("react-virtualized", "Masonry")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Masonry] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): this.type = set("keyMapper", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCellsRendered(value: /* params */ IndexRange => Unit): this.type = set("onCellsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* params */ ClientHeight => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def overscanByPixels(value: Double): this.type = set("overscanByPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollingResetTimeInterval(value: Double): this.type = set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndexNull: this.type = set("tabIndex", null)
  }
  
  def withProps(p: MasonryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: /* props */ MasonryCellProps => ReactElement,
    height: Double,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MasonryProps]))
  }
}
