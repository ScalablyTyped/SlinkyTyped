package typingsSlinky.reactDnd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DndProvider {
  object Manager {
    @JSImport("react-dnd", "DndProvider")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.reactDnd.anon.Manager): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(manager: DragDropManager): Default[tag.type, js.Object] = {
        val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactDnd.anon.Manager]))
    }
  }
  
  object Backend {
    @JSImport("react-dnd", "DndProvider")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def context(value: js.Any): this.type = set("context", value.asInstanceOf[js.Any])
      @scala.inline
      def debugMode(value: Boolean): this.type = set("debugMode", value.asInstanceOf[js.Any])
      @scala.inline
      def options(value: js.Any): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactDnd.anon.Backend[js.Any, js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typingsSlinky.dndCore.interfacesMod.Backend
    ): Builder = {
        val __props = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactDnd.anon.Backend[js.Any, js.Any]]))
    }
  }
  
}

