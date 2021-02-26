package typingsSlinky.saslExternal

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.saslExternal.saslExternalBooleans.`true`
import typingsSlinky.saslExternal.saslExternalStrings.EXTERNAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-external", JSImport.Namespace)
  @js.native
  class ^ () extends ExternalMechanism
  @JSImport("sasl-external", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-external", "Mechanism")
  @js.native
  class Mechanism () extends ExternalMechanism
  /* static member */
  @JSImport("sasl-external", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[ExternalMechanism] = js.native
  @scala.inline
  def Mechanism_=(x: Instantiable0[ExternalMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-external", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-external", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    @scala.inline
    def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-external", "prototype.name")
    @js.native
    def name: EXTERNAL = js.native
    @scala.inline
    def name_=(x: EXTERNAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
    }
  }
  
  @js.native
  trait ExternalMechanism
    extends typingsSlinky.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true` = js.native
    
    @JSName("name")
    var name_ExternalMechanism: EXTERNAL = js.native
    
    def response(cred: Credentials): String = js.native
  }
  object ExternalMechanism {
    
    @scala.inline
    def apply(challenge: String => Unit, clientFirst: `true`, name: EXTERNAL, response: Credentials => String): ExternalMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[ExternalMechanism]
    }
    
    @scala.inline
    implicit class ExternalMechanismMutableBuilder[Self <: ExternalMechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: EXTERNAL): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
