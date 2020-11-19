package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.ul.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeaheadMenu {
  
  @JSImport("react-bootstrap-typeahead", "TypeaheadMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: TypeaheadModel */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenu[T]] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyLabel(value: String): this.type = set("emptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[HTMLUListElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: LegacyRef[HTMLUListElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def labelKeyFunction1(value: T => String): this.type = set("labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelKey(value: TypeaheadLabelKey[T]): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def newSelectionPrefix(value: String): this.type = set("newSelectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactElement
    ): this.type = set("renderMenuItemChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: TypeaheadModel */](p: TypeaheadMenuProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](id: String, options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TypeaheadMenuProps[T]]))
  }
}
