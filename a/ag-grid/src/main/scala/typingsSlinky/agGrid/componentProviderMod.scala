package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.anon.InstantiableA
import typingsSlinky.agGrid.anon.InstantiableB
import typingsSlinky.agGrid.anon.`0`
import typingsSlinky.agGrid.componentResolverMod.ComponentType
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentProviderMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/componentProvider", "ComponentProvider")
  @js.native
  class ComponentProvider () extends StObject {
    
    var agDeprecatedNames: js.Any = js.native
    
    var agGridDefaults: js.Any = js.native
    
    var frameworkComponents: js.Any = js.native
    
    var gridOptions: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    var jsComponents: js.Any = js.native
    
    def registerComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
    
    def registerDefaultComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
    def registerDefaultComponent[A /* <: IComponent[_] */](rawName: String, component: AgGridRegisteredComponentInput[A], overridable: Boolean): Unit = js.native
    
    /**
      * B the business interface (ie IHeader)
      * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
      */
    def registerFwComponent[A /* <: IComponent[_] with B */, B](rawName: String, component: `0`[B]): Unit = js.native
    
    /**
      * B the business interface (ie IHeader)
      * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
      */
    def retrieve[A /* <: IComponent[_] with B */, B](rawName: String): RegisteredComponent[A, B] = js.native
    
    /* private */ def translateIfDeprecated(raw: js.Any): js.Any = js.native
  }
  
  @js.native
  sealed trait RegisteredComponentSource extends StObject
  @JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
  @js.native
  object RegisteredComponentSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RegisteredComponentSource with Double] = js.native
    
    @js.native
    sealed trait DEFAULT extends RegisteredComponentSource
    /* 0 */ val DEFAULT: typingsSlinky.agGrid.componentProviderMod.RegisteredComponentSource.DEFAULT with Double = js.native
    
    @js.native
    sealed trait REGISTERED extends RegisteredComponentSource
    /* 1 */ val REGISTERED: typingsSlinky.agGrid.componentProviderMod.RegisteredComponentSource.REGISTERED with Double = js.native
  }
  
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, String | HTMLElement]
  
  type AgGridRegisteredComponentInput[A /* <: IComponent[_] */] = AgGridComponentFunctionInput | InstantiableA[A]
  
  @js.native
  trait DeprecatedComponentName extends StObject {
    
    var newComponentName: String = js.native
    
    var propertyHolder: String = js.native
  }
  object DeprecatedComponentName {
    
    @scala.inline
    def apply(newComponentName: String, propertyHolder: String): DeprecatedComponentName = {
      val __obj = js.Dynamic.literal(newComponentName = newComponentName.asInstanceOf[js.Any], propertyHolder = propertyHolder.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatedComponentName]
    }
    
    @scala.inline
    implicit class DeprecatedComponentNameMutableBuilder[Self <: DeprecatedComponentName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewComponentName(value: String): Self = StObject.set(x, "newComponentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyHolder(value: String): Self = StObject.set(x, "propertyHolder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegisteredComponent[A /* <: IComponent[_] with B */, B] extends StObject {
    
    var component: RegisteredComponentInput[A, B] = js.native
    
    var source: RegisteredComponentSource = js.native
    
    var `type`: ComponentType = js.native
  }
  object RegisteredComponent {
    
    @scala.inline
    def apply[A /* <: IComponent[_] with B */, B](
      component: RegisteredComponentInput[A, B],
      source: RegisteredComponentSource,
      `type`: ComponentType
    ): RegisteredComponent[A, B] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredComponent[A, B]]
    }
    
    @scala.inline
    implicit class RegisteredComponentMutableBuilder[Self <: RegisteredComponent[_, _], A /* <: IComponent[_] with B */, B] (val x: Self with (RegisteredComponent[A, B])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: RegisteredComponentInput[A, B]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunction1(value: /* params */ js.Any => String | HTMLElement): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: RegisteredComponentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisteredComponentInput[A /* <: IComponent[_] with B */, B] = AgGridRegisteredComponentInput[A] | InstantiableB[B]
}
