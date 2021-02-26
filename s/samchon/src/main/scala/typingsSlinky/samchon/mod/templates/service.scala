package typingsSlinky.samchon.mod.templates

import typingsSlinky.samchon.webClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object service {
  
  @JSImport("samchon", "templates.service.Client")
  @js.native
  abstract class Client protected ()
    extends typingsSlinky.samchon.templatesMod.service.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typingsSlinky.samchon.userMod.User, driver: WebClientDriver) = this()
  }
  
  @JSImport("samchon", "templates.service.Server")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends typingsSlinky.samchon.templatesMod.service.Server
  
  @JSImport("samchon", "templates.service.Service")
  @js.native
  abstract class Service protected ()
    extends typingsSlinky.samchon.templatesMod.service.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typingsSlinky.samchon.clientMod.Client, path: String) = this()
  }
  
  @JSImport("samchon", "templates.service.User")
  @js.native
  abstract class User protected ()
    extends typingsSlinky.samchon.templatesMod.service.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typingsSlinky.samchon.serviceServerMod.Server) = this()
  }
}
