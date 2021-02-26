package typingsSlinky.samchon.mod.templates

import typingsSlinky.samchon.iclientdriverMod.IClientDriver
import typingsSlinky.samchon.iexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  @JSImport("samchon", "templates.external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalClientArray[T]
  
  @JSImport("samchon", "templates.external.ExternalServer")
  @js.native
  abstract class ExternalServer protected ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsSlinky.samchon.externalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @JSImport("samchon", "templates.external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalServerArray[T]
  
  @JSImport("samchon", "templates.external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalServerClientArray[T]
  
  @JSImport("samchon", "templates.external.ExternalSystem")
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalSystem {
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
  
  @JSImport("samchon", "templates.external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typingsSlinky.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalSystemArray[System]
  
  @JSImport("samchon", "templates.external.ExternalSystemRole")
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsSlinky.samchon.templatesMod.external.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsSlinky.samchon.externalSystemMod.ExternalSystem) = this()
  }
}
