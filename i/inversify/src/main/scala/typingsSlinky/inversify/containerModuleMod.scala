package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typingsSlinky.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerModuleMod {
  
  @JSImport("inversify/dts/container/container_module", "AsyncContainerModule")
  @js.native
  class AsyncContainerModule protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify/dts/container/container_module", "ContainerModule")
  @js.native
  class ContainerModule protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
}
