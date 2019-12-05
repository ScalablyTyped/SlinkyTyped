package typingsSlinky.samchon

import typingsSlinky.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typingsSlinky.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", JSImport.Namespace)
@js.native
object templatesExternalMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesExternalDerivedExternalClientArrayMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typingsSlinky.samchon.templatesExternalDerivedExternalServerMod.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsSlinky.samchon.templatesExternalDerivedExternalServerArrayMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesExternalDerivedExternalServerClientArrayMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsSlinky.samchon.templatesExternalExternalSystemRoleMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsSlinky.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
  
}

