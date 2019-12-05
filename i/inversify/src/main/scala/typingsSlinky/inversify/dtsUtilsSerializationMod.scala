package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Request
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/serialization", JSImport.Namespace)
@js.native
object dtsUtilsSerializationMod extends js.Object {
  def circularDependencyToException(request: Request): Unit = js.native
  def getFunctionName(v: js.Any): String = js.native
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[_]): String = js.native
  def listMetadataForTarget(serviceIdentifierString: String, target: Target): String = js.native
  def listRegisteredBindingsForServiceIdentifier(
    container: Container,
    serviceIdentifier: String,
    getBindings: js.Function2[
      /* container */ Container, 
      /* serviceIdentifier */ ServiceIdentifier[_], 
      js.Array[Binding[_]]
    ]
  ): String = js.native
}

