package typingsSlinky.reactLifecyclesCompat

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycles-compat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def polyfill[T /* <: ReactComponentClass[_] */](Comp: T): T with typingsSlinky.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill = js.native
}

