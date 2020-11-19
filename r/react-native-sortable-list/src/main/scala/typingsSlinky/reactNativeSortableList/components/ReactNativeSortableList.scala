package typingsSlinky.reactNativeSortableList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSortableList.mod.DataByNumber
import typingsSlinky.reactNativeSortableList.mod.DataByString
import typingsSlinky.reactNativeSortableList.mod.RowProps
import typingsSlinky.reactNativeSortableList.mod.SortableListProps
import typingsSlinky.reactNativeSortableList.mod.default
import typingsSlinky.reactNativeSortableList.reactNativeSortableListStrings.always
import typingsSlinky.reactNativeSortableList.reactNativeSortableListStrings.handled
import typingsSlinky.reactNativeSortableList.reactNativeSortableListStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSortableList {
  
  @JSImport("react-native-sortable-list", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, K] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T, K]] {
    
    @scala.inline
    def autoscrollAreaSize(value: Double): this.type = set("autoscrollAreaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerContainerStyle(value: StyleProp[ViewStyle]): this.type = set("innerContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerContainerStyleNull: this.type = set("innerContainerStyle", null)
    
    @scala.inline
    def keyboardShouldPersistTaps(value: never | always | handled): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def manuallyActivateRows(value: Boolean): this.type = set("manuallyActivateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActivateRow(value: K => Unit): this.type = set("onActivateRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeOrder(value: /* nextOrder */ js.Array[K] => Unit): this.type = set("onChangeOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressRow(value: K => Unit): this.type = set("onPressRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReleaseRow(value: (K, /* currentOrder */ js.Array[K]) => Unit): this.type = set("onReleaseRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def orderVarargs(value: K*): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def order(value: js.Array[K]): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshControl(value: ReactElement): this.type = set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderFooter(value: () => ReactElement): this.type = set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderHeader(value: () => ReactElement): this.type = set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def rowActivationTime(value: Double): this.type = set("rowActivationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showsVerticalScrollIndicator(value: Boolean): this.type = set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortingEnabled(value: Boolean): this.type = set("sortingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps[T, K](p: SortableListProps[T, K]): Builder[T, K] = new Builder[T, K](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T, K](data: DataByNumber[T] | DataByString[T], renderRow: RowProps[T, K] => ReactElement | Null): Builder[T, K] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    new Builder[T, K](js.Array(this.component, __props.asInstanceOf[SortableListProps[T, K]]))
  }
}
