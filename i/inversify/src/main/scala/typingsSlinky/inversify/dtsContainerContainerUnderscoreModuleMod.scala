package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.AsyncContainerModuleCallBack
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModuleCallBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/container_module", JSImport.Namespace)
@js.native
object dtsContainerContainerUnderscoreModuleMod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
}

