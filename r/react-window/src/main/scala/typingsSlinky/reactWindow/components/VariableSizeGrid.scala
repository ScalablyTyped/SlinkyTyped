package typingsSlinky.reactWindow.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactWindow.anon.ColumnIndex
import typingsSlinky.reactWindow.mod.CSSDirection
import typingsSlinky.reactWindow.mod.GridChildComponentProps
import typingsSlinky.reactWindow.mod.GridOnItemsRenderedProps
import typingsSlinky.reactWindow.mod.GridOnScrollProps
import typingsSlinky.reactWindow.mod.ReactElementType
import typingsSlinky.reactWindow.mod.VariableSizeGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VariableSizeGrid {
  
  @scala.inline
  def apply(
    children: ReactComponentClass[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VariableSizeGridProps]))
  }
  
  @JSImport("react-window", "VariableSizeGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactWindow.mod.VariableSizeGrid] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: CSSDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def estimatedColumnWidth(value: Double): this.type = set("estimatedColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def estimatedRowHeight(value: Double): this.type = set("estimatedRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialScrollLeft(value: Double): this.type = set("initialScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialScrollTop(value: Double): this.type = set("initialScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementType(value: ReactElementType): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementTypeComponentClass(value: ReactComponentClass[js.Any]): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerTagName(value: String): this.type = set("innerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemData(value: js.Any): this.type = set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemKey(value: /* params */ ColumnIndex => Key): this.type = set("itemKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemsRendered(value: /* props */ GridOnItemsRenderedProps => _): this.type = set("onItemsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* props */ GridOnScrollProps => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def outerElementType(value: ReactElementType): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerElementTypeComponentClass(value: ReactComponentClass[js.Any]): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRef(value: Ref[_]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("outerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def outerRefNull: this.type = set("outerRef", null)
    
    @scala.inline
    def outerRefRefObject(value: ReactRef[_]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerTagName(value: String): this.type = set("outerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanColumnCount(value: Double): this.type = set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanColumnsCount(value: Double): this.type = set("overscanColumnsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanCount(value: Double): this.type = set("overscanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanRowCount(value: Double): this.type = set("overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanRowsCount(value: Double): this.type = set("overscanRowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useIsScrolling(value: Boolean): this.type = set("useIsScrolling", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VariableSizeGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
