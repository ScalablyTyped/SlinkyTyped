package typingsSlinky.downshift.components

import org.scalajs.dom.raw.HTMLElement
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Downshift {
  @JSImport("downshift", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def defaultHighlightedIndex(value: Double): this.type = set("defaultHighlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultHighlightedIndexNull: this.type = set("defaultHighlightedIndex", null)
    @scala.inline
    def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def environment(value: Environment): this.type = set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def getA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[js.Any] => String): this.type = set("getA11yStatusMessage", js.Any.fromFunction1(value))
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
    def initialSelectedItem(value: js.Any): this.type = set("initialSelectedItem", value.asInstanceOf[js.Any])
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
    def itemToString(value: /* item */ js.Any | Null => String): this.type = set("itemToString", js.Any.fromFunction1(value))
    @scala.inline
    def labelId(value: String): this.type = set("labelId", value.asInstanceOf[js.Any])
    @scala.inline
    def menuId(value: String): this.type = set("menuId", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(
      value: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit): this.type = set("onInputValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def onOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[js.Any] => Unit): this.type = set("onOuterClick", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(
      value: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit
    ): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def onStateChange(
      value: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit
    ): this.type = set("onStateChange", js.Any.fromFunction2(value))
    @scala.inline
    def onUserAction(
      value: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Unit
    ): this.type = set("onUserAction", js.Any.fromFunction2(value))
    @scala.inline
    def scrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): this.type = set("scrollIntoView", js.Any.fromFunction2(value))
    @scala.inline
    def selectedItem(value: js.Any): this.type = set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedItemNull: this.type = set("selectedItem", null)
    @scala.inline
    def selectedItemChanged(value: (js.Any, js.Any) => Boolean): this.type = set("selectedItemChanged", js.Any.fromFunction2(value))
    @scala.inline
    def stateReducer(
      value: (/* state */ DownshiftState[js.Any], /* changes */ StateChangeOptions[js.Any]) => Partial[StateChangeOptions[js.Any]]
    ): this.type = set("stateReducer", js.Any.fromFunction2(value))
    @scala.inline
    def suppressRefError(value: Boolean): this.type = set("suppressRefError", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DownshiftProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Downshift.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

