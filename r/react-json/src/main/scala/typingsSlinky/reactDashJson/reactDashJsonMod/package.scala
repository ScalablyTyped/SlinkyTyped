package typingsSlinky.reactDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonMod {
  import slinky.core.ReactComponentClass

  type Json = ReactComponentClass[JsonProperties]
  type OnChangeHandler = js.Function1[/* value */ js.Any, Unit]
}
