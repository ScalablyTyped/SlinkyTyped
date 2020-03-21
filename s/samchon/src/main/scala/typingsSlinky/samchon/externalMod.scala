package typingsSlinky.samchon

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iexternalserverMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", JSImport.Namespace)
@js.native
object externalMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.externalClientArrayMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typingsSlinky.samchon.externalServerMod.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsSlinky.samchon.externalServerArrayMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.externalServerClientArrayMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsSlinky.samchon.externalSystemMod.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray[typingsSlinky.samchon.externalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray[typingsSlinky.samchon.externalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsSlinky.samchon.externalSystemRoleMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsSlinky.samchon.externalSystemMod.ExternalSystem) = this()
  }
  
}

