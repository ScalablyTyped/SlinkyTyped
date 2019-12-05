package typingsSlinky.reactDashAdal.reactDashAdalMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "withAdalLogin")
@js.native
object withAdalLogin extends js.Object {
  def apply(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ ReactComponentClass[js.Object] | ReactComponentClass[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ReactComponentClass[js.Object]
  ] = js.native
}

