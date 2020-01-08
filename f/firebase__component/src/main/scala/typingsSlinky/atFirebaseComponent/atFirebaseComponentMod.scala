package typingsSlinky.atFirebaseComponent

import typingsSlinky.atFirebaseComponent.distSrcTypesMod.ComponentType
import typingsSlinky.atFirebaseComponent.distSrcTypesMod.InstanceFactory
import typingsSlinky.atFirebaseComponent.distSrcTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component", JSImport.Namespace)
@js.native
object atFirebaseComponentMod extends js.Object {
  @js.native
  class Component[T /* <: Name */] protected ()
    extends typingsSlinky.atFirebaseComponent.distSrcComponentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whehter the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @js.native
  class ComponentContainer protected ()
    extends typingsSlinky.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @js.native
  class Provider[T /* <: Name */] protected ()
    extends typingsSlinky.atFirebaseComponent.distSrcProviderMod.Provider[T] {
    def this(
      name: T,
      container: typingsSlinky.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer
    ) = this()
  }
  
}

