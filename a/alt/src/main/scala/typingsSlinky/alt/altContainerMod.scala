package typingsSlinky.alt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.alt.AltJS.Alt
import typingsSlinky.alt.AltJS.AltStore
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object altContainerMod extends Shortcut {
  
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  val ^ : ComponentClass[ContainerProps, js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends Component[ContainerProps, js.Object, js.Any] {
    def this(props: ContainerProps) = this()
    def this(props: ContainerProps, context: js.Any) = this()
  }
  
  type AltContainer = ReactElement
  
  @js.native
  trait ContainerProps extends StObject {
    
    var actions: js.UndefOr[StringDictionary[js.Object]] = js.native
    
    var component: js.UndefOr[ReactComponentClass[_]] = js.native
    
    var flux: js.UndefOr[Alt] = js.native
    
    var inject: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var render: js.UndefOr[js.Function1[/* repeated */ js.Any, ReactElement]] = js.native
    
    var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
    
    var store: js.UndefOr[AltStore[_]] = js.native
    
    var stores: js.UndefOr[js.Array[AltStore[_]]] = js.native
    
    var transform: js.UndefOr[js.Function2[/* store */ AltStore[_], /* actions */ js.Any, _]] = js.native
  }
  object ContainerProps {
    
    @scala.inline
    def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: StringDictionary[js.Object]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFlux(value: Alt): Self = StObject.set(x, "flux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluxUndefined: Self = StObject.set(x, "flux", js.undefined)
      
      @scala.inline
      def setInject(value: StringDictionary[js.Any]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setRender(value: /* repeated */ js.Any => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setShouldComponentUpdate(value: /* props */ js.Any => Boolean): Self = StObject.set(x, "shouldComponentUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
      
      @scala.inline
      def setStore(value: AltStore[_]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setStores(value: js.Array[AltStore[_]]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      @scala.inline
      def setStoresVarargs(value: AltStore[js.Any]*): Self = StObject.set(x, "stores", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: (/* store */ AltStore[_], /* actions */ js.Any) => _): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = ComponentClass[ContainerProps, js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `altContainerMod.foo` */
  override def _to: ComponentClass[ContainerProps, js.Object] = ^
}
