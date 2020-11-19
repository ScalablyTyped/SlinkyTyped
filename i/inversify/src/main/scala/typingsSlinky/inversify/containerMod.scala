package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.ContainerOptions
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/container/container", JSImport.Namespace)
@js.native
object containerMod extends js.Object {
  
  @js.native
  class Container ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Container {
    def this(containerOptions: ContainerOptions) = this()
    
    var _bindingDictionary: js.Any = js.native
    
    /* private */ def _get[T](
      avoidConstraints: js.Any,
      isMultiInject: js.Any,
      targetType: js.Any,
      serviceIdentifier: js.Any,
      key: js.Any,
      value: js.Any
    ): js.Any = js.native
    
    /* private */ def _getContainerModuleHelpersFactory(): js.Any = js.native
    
    var _metadataReader: js.Any = js.native
    
    var _middleware: js.Any = js.native
    
    /* private */ def _planAndResolve[T](): js.Any = js.native
    
    var _snapshots: js.Any = js.native
    
    def createChild(containerOptions: ContainerOptions): Container = js.native
    
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): js.Array[T] = js.native
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): js.Array[T] = js.native
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): js.Array[T] = js.native
    
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: js.Any): js.Array[T] = js.native
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: js.Any): js.Array[T] = js.native
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: js.Any): js.Array[T] = js.native
  }
  /* static members */
  @js.native
  object Container extends js.Object {
    
    def merge(
      container1: typingsSlinky.inversify.interfacesMod.interfaces.Container,
      container2: typingsSlinky.inversify.interfacesMod.interfaces.Container
    ): typingsSlinky.inversify.interfacesMod.interfaces.Container = js.native
  }
}
