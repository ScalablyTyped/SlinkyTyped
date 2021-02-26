package typingsSlinky.ionic

import typingsSlinky.ionic.anon.IdNumber
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("ionic/lib/session", "BaseSession")
  @js.native
  class BaseSession protected () extends StObject {
    def this(e: SessionDeps) = this()
    
    val e: SessionDeps = js.native
    
    def getUser(): IdNumber = js.native
    
    def getUserToken(): String = js.native
    
    def isLoggedIn(): Boolean = js.native
    
    def logout(): js.Promise[Unit] = js.native
  }
  
  @JSImport("ionic/lib/session", "ProSession")
  @js.native
  class ProSession protected ()
    extends BaseSession
       with ISession {
    def this(e: SessionDeps) = this()
    
    /* InferMemberOverrides */
    override def getUser(): IdNumber = js.native
    
    /* InferMemberOverrides */
    override def getUserToken(): String = js.native
    
    /* InferMemberOverrides */
    override def isLoggedIn(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def logout(): js.Promise[Unit] = js.native
  }
  
  @JSImport("ionic/lib/session", "promptToLogin")
  @js.native
  def promptToLogin(env: IonicEnvironment): js.Promise[Unit] = js.native
  
  @js.native
  trait SessionDeps extends StObject {
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
  }
  object SessionDeps {
    
    @scala.inline
    def apply(client: IClient, config: IConfig): SessionDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionDeps]
    }
    
    @scala.inline
    implicit class SessionDepsMutableBuilder[Self <: SessionDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
