package typingsSlinky.samchon

import typingsSlinky.samchon.webClientDriverMod.WebClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/service", JSImport.Namespace)
@js.native
object serviceMod extends js.Object {
  
  @js.native
  abstract class Client protected ()
    extends typingsSlinky.samchon.clientMod.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typingsSlinky.samchon.userMod.User, driver: WebClientDriver) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends typingsSlinky.samchon.serviceServerMod.Server
  
  @js.native
  abstract class Service protected ()
    extends typingsSlinky.samchon.serviceServiceMod.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typingsSlinky.samchon.clientMod.Client, path: String) = this()
  }
  
  @js.native
  abstract class User protected ()
    extends typingsSlinky.samchon.userMod.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typingsSlinky.samchon.serviceServerMod.Server) = this()
  }
}
