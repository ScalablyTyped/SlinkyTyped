package typingsSlinky.nextReduxWrapper.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.nextReduxWrapper.mod.NextJSAppContext
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable
  extends Instantiable2[/* props */ js.Any, /* context */ js.Any, ComponentDidCatch] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var displayName: String = js.native
  def getInitialProps(appCtx: NextJSAppContext): js.Promise[InitialProps] = js.native
}

