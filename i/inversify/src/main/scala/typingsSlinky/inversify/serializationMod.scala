package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversify.interfacesMod.interfaces.Request
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.interfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/serialization", JSImport.Namespace)
@js.native
object serializationMod extends js.Object {
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

