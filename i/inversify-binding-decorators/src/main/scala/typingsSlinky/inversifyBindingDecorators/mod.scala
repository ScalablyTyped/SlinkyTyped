package typingsSlinky.inversifyBindingDecorators

import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversify.interfacesMod.interfaces.ContainerModule
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-binding-decorators", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def autoProvide(container: Container, modules: js.Any*): Unit = js.native
  
  def buildProviderModule(): ContainerModule = js.native
  
  def fluentProvide(serviceIdentifier: ServiceIdentifier[_]): ProvideInWhenOnSyntax[_] = js.native
  
  def provide(serviceIdentifier: ServiceIdentifier[_]): js.Function1[/* target */ js.Any, _] = js.native
  def provide(serviceIdentifier: ServiceIdentifier[_], force: Boolean): js.Function1[/* target */ js.Any, _] = js.native
}
