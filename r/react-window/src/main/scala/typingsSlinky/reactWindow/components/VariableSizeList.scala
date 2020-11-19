package typingsSlinky.reactWindow.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactWindow.mod.CSSDirection
import typingsSlinky.reactWindow.mod.Direction
import typingsSlinky.reactWindow.mod.Layout
import typingsSlinky.reactWindow.mod.ListChildComponentProps
import typingsSlinky.reactWindow.mod.ListOnItemsRenderedProps
import typingsSlinky.reactWindow.mod.ListOnScrollProps
import typingsSlinky.reactWindow.mod.ReactElementType
import typingsSlinky.reactWindow.mod.VariableSizeListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VariableSizeList {
  
  @JSImport("react-window", "VariableSizeList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactWindow.mod.VariableSizeList] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: CSSDirection | Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def estimatedItemSize(value: Double): this.type = set("estimatedItemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialScrollOffset(value: Double): this.type = set("initialScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementTypeComponentClass(value: ReactComponentClass[js.Any]): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerElementType(value: ReactElementType): this.type = set("innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def innerTagName(value: String): this.type = set("innerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemData(value: js.Any): this.type = set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemKey(value: (/* index */ Double, /* data */ js.Any) => Key): this.type = set("itemKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def layout(value: Layout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onItemsRendered(value: /* props */ ListOnItemsRenderedProps => _): this.type = set("onItemsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* props */ ListOnScrollProps => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def outerElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerElementTypeComponentClass(value: ReactComponentClass[js.Any]): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerElementType(value: ReactElementType): this.type = set("outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRefRefObject(value: ReactRef[_]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("outerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def outerRef(value: Ref[_]): this.type = set("outerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outerRefNull: this.type = set("outerRef", null)
    
    @scala.inline
    def outerTagName(value: String): this.type = set("outerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanCount(value: Double): this.type = set("overscanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useIsScrolling(value: Boolean): this.type = set("useIsScrolling", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VariableSizeListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    children: ReactComponentClass[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    itemSize: Double => Double,
    width: Double | String
  ): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = js.Any.fromFunction1(itemSize), width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VariableSizeListProps]))
  }
}
