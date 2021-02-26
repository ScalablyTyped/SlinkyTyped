package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.anon.FilterPlaceholder
import typingsSlinky.griddleReact.mod.GriddleComponents
import typingsSlinky.griddleReact.mod.GriddleEvents
import typingsSlinky.griddleReact.mod.GriddleInitialState
import typingsSlinky.griddleReact.mod.GriddlePageProperties
import typingsSlinky.griddleReact.mod.GriddlePlugin
import typingsSlinky.griddleReact.mod.GriddleProps
import typingsSlinky.griddleReact.mod.GriddleRenderProperties
import typingsSlinky.griddleReact.mod.GriddleSortKey
import typingsSlinky.griddleReact.mod.GriddleStyleConfig
import typingsSlinky.griddleReact.mod.Listener
import typingsSlinky.griddleReact.mod.PropertyBag
import typingsSlinky.griddleReact.mod.Reducer
import typingsSlinky.griddleReact.mod.Selector
import typingsSlinky.griddleReact.mod.SettingsComponentObject
import typingsSlinky.griddleReact.mod.default
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GriddleReact {
  
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GriddleProps[T]]))
  }
  
  @JSImport("griddle-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    
    @scala.inline
    def components(value: GriddleComponents): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def core(value: GriddlePlugin): this.type = set("core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[T]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: T*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def enableSettings(value: Boolean): this.type = set("enableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: GriddleEvents): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: GriddleInitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listeners(value: PropertyBag[Listener]): this.type = set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageProperties(value: GriddlePageProperties): this.type = set("pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plugins(value: js.Array[GriddlePlugin]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pluginsVarargs(value: GriddlePlugin*): this.type = set("plugins", js.Array(value :_*))
    
    @scala.inline
    def reducer(value: PropertyBag[Reducer]): this.type = set("reducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reduxMiddleware(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): this.type = set("reduxMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reduxMiddlewareVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): this.type = set("reduxMiddleware", js.Array(value :_*))
    
    @scala.inline
    def renderProperties(value: GriddleRenderProperties): this.type = set("renderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectors(value: PropertyBag[Selector]): this.type = set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def settingsComponentObjects(value: PropertyBag[SettingsComponentObject]): this.type = set("settingsComponentObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): this.type = set("sortMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def sortProperties(value: js.Array[GriddleSortKey]): this.type = set("sortProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortPropertiesVarargs(value: GriddleSortKey*): this.type = set("sortProperties", js.Array(value :_*))
    
    @scala.inline
    def storeKey(value: String): this.type = set("storeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleConfig(value: GriddleStyleConfig): this.type = set("styleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textProperties(value: FilterPlaceholder): this.type = set("textProperties", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: GriddleReact.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: GriddleProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
