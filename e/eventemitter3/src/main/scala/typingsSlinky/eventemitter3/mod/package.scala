package typingsSlinky.eventemitter3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, scala.Unit]
}
