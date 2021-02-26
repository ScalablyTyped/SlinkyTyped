package typingsSlinky.samchonFramework.mod.templates

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  @JSImport("samchon-framework", "templates.external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalClientArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalServer")
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
  
  @JSImport("samchon-framework", "templates.external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalServerArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalServerClientArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalSystem")
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
  
  @JSImport("samchon-framework", "templates.external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.mod.templates.external.ExternalSystemArray[System]
  
  @JSImport("samchon-framework", "templates.external.ExternalSystemRole")
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
