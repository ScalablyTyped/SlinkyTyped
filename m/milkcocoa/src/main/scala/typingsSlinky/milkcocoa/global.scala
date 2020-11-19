package typingsSlinky.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object milkcocoa extends js.Object {
    
    @js.native
    class MilkCocoa protected ()
      extends typingsSlinky.milkcocoa.milkcocoa.MilkCocoa {
      def this(host: String) = this()
      def this(host: String, callback: js.Function) = this()
    }
    @js.native
    object MilkCocoa extends js.Object {
      
      @js.native
      object Error extends js.Object {
        
        @js.native
        object AddAccount extends js.Object {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount with Double] = js.native
          
          /* 1 */ val AlreadyExist: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.AlreadyExist with Double = js.native
          
          /* 0 */ val FormatError: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.FormatError with Double = js.native
        }
        
        @js.native
        object GetCurrentUser extends js.Object {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser with Double] = js.native
          
          /* 0 */ val NotLoggedIn: typingsSlinky.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser.NotLoggedIn with Double = js.native
        }
        
        @js.native
        object Login extends js.Object {
          
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
