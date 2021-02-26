package typingsSlinky.octokitAuthToken

import typingsSlinky.octokitAuthToken.typesMod.Authentication
import typingsSlinky.octokitAuthToken.typesMod.StrategyInterface
import typingsSlinky.octokitAuthToken.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/auth-token", "createTokenAuth")
  @js.native
  val createTokenAuth: StrategyInterface = js.native
  
  @js.native
  trait Types extends StObject {
    
    var Authentication: typingsSlinky.octokitAuthToken.typesMod.Authentication = js.native
    
    var StrategyOptions: Token = js.native
  }
  object Types {
    
    @scala.inline
    def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
      val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyOptions(value: Token): Self = StObject.set(x, "StrategyOptions", value.asInstanceOf[js.Any])
    }
  }
}
