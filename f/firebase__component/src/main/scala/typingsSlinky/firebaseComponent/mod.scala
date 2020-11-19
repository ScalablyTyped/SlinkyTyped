package typingsSlinky.firebaseComponent

import typingsSlinky.firebaseComponent.typesMod.ComponentType
import typingsSlinky.firebaseComponent.typesMod.InstanceFactory
import typingsSlinky.firebaseComponent.typesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/component", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Component[T /* <: Name */] protected ()
    extends typingsSlinky.firebaseComponent.componentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @js.native
  class ComponentContainer protected ()
    extends typingsSlinky.firebaseComponent.componentContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @js.native
  class Provider[T /* <: Name */] protected ()
    extends typingsSlinky.firebaseComponent.providerMod.Provider[T] {
    def this(name: T, container: typingsSlinky.firebaseComponent.componentContainerMod.ComponentContainer) = this()
  }
}
