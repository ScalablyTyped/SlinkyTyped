package typingsSlinky.pThrottle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AbortError = typingsSlinky.pThrottle.mod.AbortErrorClass
  type ThrottledFunction[Arguments /* <: js.Array[_] */, Return] = (js.Function1[/* arguments */ Arguments, js.Promise[Return]]) with typingsSlinky.pThrottle.AnonAbort
}
