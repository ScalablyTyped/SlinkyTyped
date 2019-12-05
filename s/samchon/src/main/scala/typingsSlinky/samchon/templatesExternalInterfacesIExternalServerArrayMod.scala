package typingsSlinky.samchon

import typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typingsSlinky.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/interfaces/IExternalServerArray", JSImport.Namespace)
@js.native
object templatesExternalInterfacesIExternalServerArrayMod extends js.Object {
  @js.native
  trait IExternalServerArray[System /* <: IExternalServer */] extends ExternalSystemArray[System] {
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
  
}

