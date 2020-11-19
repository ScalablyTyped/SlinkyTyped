package typingsSlinky.reactAdal.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-adal", "withAdalLogin")
@js.native
object withAdalLogin extends js.Object {
  
  def apply(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ ReactComponentClass[js.Object], 
    /* renderLoading */ js.Function0[ReactElement | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, ReactElement | Null], 
    ReactComponentClass[js.Object]
  ] = js.native
}
