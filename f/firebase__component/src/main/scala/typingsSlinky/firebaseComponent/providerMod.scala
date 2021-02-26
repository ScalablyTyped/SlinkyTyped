package typingsSlinky.firebaseComponent

import typingsSlinky.firebaseComponent.anon.Identifier
import typingsSlinky.firebaseComponent.anon.Optional
import typingsSlinky.firebaseComponent.componentContainerMod.ComponentContainer
import typingsSlinky.firebaseComponent.componentMod.Component
import typingsSlinky.firebaseComponent.typesMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@firebase/component/dist/src/provider", "Provider")
  @js.native
  class Provider[T /* <: Name */] protected () extends StObject {
    def this(name: T, container: ComponentContainer) = this()
    
    def clearInstance(): Unit = js.native
    def clearInstance(identifier: String): Unit = js.native
    
    var component: js.Any = js.native
    
    val container: js.Any = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * @param identifier A provider can provide mulitple instances of a service
      * if this.component.multipleInstances is true.
      */
    def get(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
      ] = js.native
    def get(identifier: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
      ] = js.native
    
    def getComponent(): Component[T] | Null = js.native
    
    def getImmediate(): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    /**
      *
      * @param options.identifier A provider can provide mulitple instances of a service
      * if this.component.multipleInstances is true.
      * @param options.optional If optional is false or not provided, the method throws an error when
      * the service is not immediately available.
      * If optional is true, the method returns null if the service is not immediately available.
      */
    def getImmediate(options: Identifier): (/* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any) | Null = js.native
    def getImmediate(options: Optional): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    
    var getOrInitializeService: js.Any = js.native
    
    val instances: js.Any = js.native
    
    val instancesDeferred: js.Any = js.native
    
    def isComponentSet(): Boolean = js.native
    
    val name: js.Any = js.native
    
    var normalizeInstanceIdentifier: js.Any = js.native
    
    def setComponent(component: Component[T]): Unit = js.native
  }
}
