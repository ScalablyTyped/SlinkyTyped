package typingsSlinky.inversifyBindingDecorators

import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversify.interfacesMod.interfaces.ContainerModule
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-binding-decorators", "autoProvide")
  @js.native
  def autoProvide(container: Container, modules: js.Any*): Unit = js.native
  
  @JSImport("inversify-binding-decorators", "buildProviderModule")
  @js.native
  def buildProviderModule(): ContainerModule = js.native
  
  @JSImport("inversify-binding-decorators", "fluentProvide")
  @js.native
  def fluentProvide(serviceIdentifier: ServiceIdentifier[_]): ProvideInWhenOnSyntax[_] = js.native
  
  @JSImport("inversify-binding-decorators", "provide")
  @js.native
  def provide(serviceIdentifier: ServiceIdentifier[_]): js.Function1[/* target */ js.Any, _] = js.native
  @JSImport("inversify-binding-decorators", "provide")
  @js.native
  def provide(serviceIdentifier: ServiceIdentifier[_], force: Boolean): js.Function1[/* target */ js.Any, _] = js.native
}
