package typingsSlinky.reactInspector.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.InspectorNodeParams
import typingsSlinky.reactInspector.mod.InspectorTheme
import typingsSlinky.reactInspector.reactInspectorBooleans.`false`
import typingsSlinky.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInspector {
  
  object InspectorAsTableProps {
    
    @JSImport("react-inspector", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def columnsVarargs(value: String*): this.type = set("columns", js.Array(value :_*))
      
      @scala.inline
      def columns(value: js.Array[String]): this.type = set("columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactInspector.mod.InspectorAsTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(table: `true`): Builder = {
      val __props = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactInspector.mod.InspectorAsTableProps]))
    }
  }
  
  object InspectorAsTreeProps {
    
    @JSImport("react-inspector", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def expandLevel(value: Double): this.type = set("expandLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def expandPathsVarargs(value: String*): this.type = set("expandPaths", js.Array(value :_*))
      
      @scala.inline
      def expandPaths(value: String | js.Array[String]): this.type = set("expandPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nodeRenderer(value: /* params */ InspectorNodeParams => ReactElement): this.type = set("nodeRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def showNonenumerable(value: Boolean): this.type = set("showNonenumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sortObjectKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): this.type = set("sortObjectKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def sortObjectKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def table(value: `false`): this.type = set("table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactInspector.mod.InspectorAsTreeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: InspectorAsTreeProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
