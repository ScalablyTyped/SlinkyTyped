package typingsSlinky.cleaveDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactPropsMod {
  import typingsSlinky.react.reactMod.EventHandler
  import typingsSlinky.react.reactMod.ReactInstance

  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ ReactInstance, Unit]
}
