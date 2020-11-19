package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.EventItem
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.menuMod.ItemsT
import typingsSlinky.baseui.menuMod.RenderItemProps
import typingsSlinky.baseui.menuMod.RenderProps
import typingsSlinky.baseui.menuMod.StatefulContainerProps
import typingsSlinky.baseui.menuMod.StatefulContainerState
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulContainer {
  
  @JSImport("baseui/menu", "StatefulContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.menuMod.StatefulContainer] {
    
    @scala.inline
    def addMenuToNesting(value: /* ref */ Ref[HTMLElement] => Unit): this.type = set("addMenuToNesting", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: /* args */ RenderProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def getChildMenu(value: /* ref */ Ref[HTMLElement] => Unit): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def getParentMenu(value: /* ref */ Ref[HTMLElement] => Unit): this.type = set("getParentMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def getRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): this.type = set("getRequiredItemProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def initialState(value: StatefulContainerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): this.type = set("onActiveDescendantChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemSelect(value: /* args */ EventItem => js.Any): this.type = set("onItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeMenuFromNesting(value: /* ref */ Ref[HTMLElement] => Unit): this.type = set("removeMenuFromNesting", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootRefRefObject(value: ReactRef[_]): this.type = set("rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("rootRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootRef(value: Ref[_]): this.type = set("rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootRefNull: this.type = set("rootRef", null)
    
    @scala.inline
    def stateReducer(
      value: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(items: ItemsT): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
}
