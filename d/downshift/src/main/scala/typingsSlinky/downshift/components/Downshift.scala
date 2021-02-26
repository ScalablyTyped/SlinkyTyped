package typingsSlinky.downshift.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.downshift.mod.A11yStatusMessageOptions
import typingsSlinky.downshift.mod.ControllerStateAndHelpers
import typingsSlinky.downshift.mod.DownshiftProps
import typingsSlinky.downshift.mod.DownshiftState
import typingsSlinky.downshift.mod.Environment
import typingsSlinky.downshift.mod.StateChangeOptions
import typingsSlinky.downshift.mod.default
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Downshift {
  
  @scala.inline
  def apply[Item](): Builder[Item] = {
    val __props = js.Dynamic.literal()
    new Builder[Item](js.Array(this.component, __props.asInstanceOf[DownshiftProps[Item]]))
  }
  
  @JSImport("downshift", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Item] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[Item]] {
    
    @scala.inline
    def children(value: /* options */ ControllerStateAndHelpers[Item] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def defaultHighlightedIndex(value: Double): this.type = set("defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultHighlightedIndexNull: this.type = set("defaultHighlightedIndex", null)
    
    @scala.inline
    def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def environment(value: Environment): this.type = set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): this.type = set("getA11yStatusMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def getItemId(value: /* index */ js.UndefOr[Double] => String): this.type = set("getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def highlightedIndex(value: Double): this.type = set("highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightedIndexNull: this.type = set("highlightedIndex", null)
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialHighlightedIndex(value: Double): this.type = set("initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialHighlightedIndexNull: this.type = set("initialHighlightedIndex", null)
    
    @scala.inline
    def initialInputValue(value: String): this.type = set("initialInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialIsOpen(value: Boolean): this.type = set("initialIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSelectedItem(value: Item): this.type = set("initialSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputValueNull: this.type = set("inputValue", null)
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemCount(value: Double): this.type = set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemToString(value: /* item */ Item | Null => String): this.type = set("itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelId(value: String): this.type = set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuId(value: String): this.type = set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit): this.type = set("onInputValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit): this.type = set("onOuterClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): this.type = set("onStateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): this.type = set("onUserAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def scrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): this.type = set("scrollIntoView", js.Any.fromFunction2(value))
    
    @scala.inline
    def selectedItem(value: Item): this.type = set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedItemChanged(value: (Item, Item) => Boolean): this.type = set("selectedItemChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def selectedItemNull: this.type = set("selectedItem", null)
    
    @scala.inline
    def stateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): this.type = set("stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def suppressRefError(value: Boolean): this.type = set("suppressRefError", value.asInstanceOf[js.Any])
  }
  
  implicit def make[Item](companion: Downshift.type): Builder[Item] = new Builder[Item](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Item](p: DownshiftProps[Item]): Builder[Item] = new Builder[Item](js.Array(this.component, p.asInstanceOf[js.Any]))
}
