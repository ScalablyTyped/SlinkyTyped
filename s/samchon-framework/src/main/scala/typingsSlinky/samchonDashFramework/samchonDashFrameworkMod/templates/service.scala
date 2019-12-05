package typingsSlinky.samchonDashFramework.samchonDashFrameworkMod.templates

import typingsSlinky.samchon.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates.service")
@js.native
object service extends js.Object {
  @js.native
  abstract class Client protected ()
    extends typingsSlinky.samchon.samchonMod.templates.service.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typingsSlinky.samchon.templatesServiceUserMod.User, driver: WebClientDriver) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends typingsSlinky.samchon.samchonMod.templates.service.Server
  
  @js.native
  abstract class Service protected ()
    extends typingsSlinky.samchon.samchonMod.templates.service.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typingsSlinky.samchon.templatesServiceClientMod.Client, path: String) = this()
  }
  
  @js.native
  abstract class User protected ()
    extends typingsSlinky.samchon.samchonMod.templates.service.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typingsSlinky.samchon.templatesServiceServerMod.Server) = this()
  }
  
}

