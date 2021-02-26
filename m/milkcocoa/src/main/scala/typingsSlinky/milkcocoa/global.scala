package typingsSlinky.milkcocoa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object milkcocoa {
    
    @JSGlobal("milkcocoa.MilkCocoa")
    @js.native
    class MilkCocoa protected ()
      extends typingsSlinky.milkcocoa.milkcocoa.MilkCocoa {
      def this(host: String) = this()
      def this(host: String, callback: js.Function) = this()
    }
    object MilkCocoa {
      
      object Error {
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
        @js.native
        object AddAccount extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount with Double] = js.native
          
          /* 1 */ val AlreadyExist: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.AlreadyExist with Double = js.native
          
          /* 0 */ val FormatError: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.FormatError with Double = js.native
        }
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.GetCurrentUser")
        @js.native
        object GetCurrentUser extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser with Double] = js.native
          
          /* 0 */ val NotLoggedIn: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser.NotLoggedIn with Double = js.native
        }
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.Login")
        @js.native
        object Login extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.Login with Double] = js.native
          
          /* 2 */ val EmailNotVerificated: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.Login.EmailNotVerificated with Double = js.native
          
          /* 0 */ val FormatError: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.Login.FormatError with Double = js.native
          
          /* 1 */ val LoginError: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.Login.LoginError with Double = js.native
        }
      }
    }
  }
}
