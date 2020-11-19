package typingsSlinky.reactPopper.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactPopper.mod.ReferenceChildrenProps
import typingsSlinky.reactPopper.mod.ReferenceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reference {
  
  @JSImport("react-popper", "Reference")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPopper.mod.Reference] {
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
  }
  
  def withProps(p: ReferenceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: ReferenceChildrenProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReferenceProps]))
  }
}
