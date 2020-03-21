package typingsSlinky.samchonFramework.mod.templates

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iexternalserverMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates.external")
@js.native
object external extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalServer {
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
    extends typingsSlinky.samchon.mod.templates.external.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalSystem {
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
    extends typingsSlinky.samchon.mod.templates.external.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsSlinky.samchon.externalSystemMod.ExternalSystem) = this()
  }
  
}

