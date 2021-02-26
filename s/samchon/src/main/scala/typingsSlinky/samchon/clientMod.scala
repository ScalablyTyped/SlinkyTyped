package typingsSlinky.samchon

import typingsSlinky.samchon.iprotocolMod.IProtocol
import typingsSlinky.samchon.serviceServiceMod.Service
import typingsSlinky.samchon.userMod.User
import typingsSlinky.samchon.webClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("samchon/templates/service/Client", "Client")
  @js.native
  abstract class Client protected () extends IProtocol {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: User, driver: WebClientDriver) = this()
    
    /**
      * Change related {@link Service} object.
      *
      * @param path Requested, identifier path.
      */
    /* protected */ def changeService(path: String): Unit = js.native
    /**
      * Change {@link Service} to another.
      *
      * @param service {@link service} object to newly assigned.
      */
    /* protected */ def changeService(service: Service): Unit = js.native
    
    /**
      * Close connection.
      */
    def close(): Unit = js.native
    
    /**
      * @hidden
      */
    var communicator_ : js.Any = js.native
    
    /**
      * Factory method creating {@link Service} object.
      *
      * @param path Requested path.
      * @return A newly created {@link Service} object or ```null```.
      */
    /* protected */ def createService(path: String): Service = js.native
    
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is called when the {@link Client} object is destructed and this
      * {@link Client} object is destructed when connection with the remote client is closed or this {@link Client}
      * object is {@link User.erase erased} from its parent {@link User} object.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link Client} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
      *
      * ```typescript
      * class MyUser extends service.Client
      * {
      *     protected destructor(): void
      *     {
      *         // DO SOMETHING
      *         this.do_something();
      *
      *         // CALL SUPER.DESTRUCTOR() ON TAIL. DON'T FORGET THIS
      *         super.destructor();
      *     }
      * }
      * ```
      */
    /* protected */ def destructor(): Unit = js.native
    
    /**
      * Get sequence number.
      *
      * Get sequence number of this {@link Client} object in the parent {@link User} object. This sequence number also
      * be a *key* in the parent {@link User} object, who extended the ```std.HashMap<number, Client>```.
      *
      * @return Sequence number.
      */
    def getNo(): Double = js.native
    
    /**
      * Get child {@link Service} object.
      *
      * @return The child {@link Service} object.
      */
    def getService(): Service = js.native
    
    /**
      * Get parent {@link User} object.
      *
      * Get the parent {@link User} object, who is groupping {@link Client} objects with same session id.
      *
      * @return The parent {@link User} object.
      */
    def getUser(): User = js.native
    
    /**
      * @hidden
      */
    var no_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var service_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var user_ : js.Any = js.native
  }
}
