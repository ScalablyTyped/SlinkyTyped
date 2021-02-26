package typingsSlinky.reactPopper.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.typesMod.PositioningStrategy
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactPopper.anon.PartialState
import typingsSlinky.reactPopper.mod.Modifier
import typingsSlinky.reactPopper.mod.PopperChildrenProps
import typingsSlinky.reactPopper.mod.PopperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popper {
  
  @scala.inline
  def apply[Modifiers](children: PopperChildrenProps => ReactElement): Builder[Modifiers] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Modifiers](js.Array(this.component, __props.asInstanceOf[PopperProps[Modifiers]]))
  }
  
  @JSImport("react-popper", "Popper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Modifiers] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPopper.mod.Popper[Modifiers]] {
    
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifiers(value: js.Array[Modifier[Modifiers, js.Object]]): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifiersVarargs(value: (Modifier[Modifiers, js.Object])*): this.type = set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def onFirstUpdate(value: /* state */ PartialState => Unit): this.type = set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def referenceElement(value: HTMLElement | VirtualElement): this.type = set("referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def referenceElementHTMLElement(value: HTMLElement): this.type = set("referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strategy(value: PositioningStrategy): this.type = set("strategy", value.asInstanceOf[js.Any])
  }
  
  def withProps[Modifiers](p: PopperProps[Modifiers]): Builder[Modifiers] = new Builder[Modifiers](js.Array(this.component, p.asInstanceOf[js.Any]))
}
