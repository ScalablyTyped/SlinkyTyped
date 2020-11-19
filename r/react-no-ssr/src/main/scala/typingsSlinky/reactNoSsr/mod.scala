package typingsSlinky.reactNoSsr

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNoSsr.anon.OnSSR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-no-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default ()
    extends Component[OnSSR, js.Object, js.Any]
  
  type NoSSR = ReactComponentClass[OnSSR]
}
