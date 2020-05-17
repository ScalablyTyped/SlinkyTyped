package typingsSlinky.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - WhenFalse
  - WhenTrue
*/
trait TypeByBuildFlag[Flag /* <: js.UndefOr[Boolean] */, WhenTrue, WhenFalse] extends js.Object

object TypeByBuildFlag {
  @scala.inline
  implicit def apply[Flag, WhenTrue, WhenFalse](value: WhenFalse | WhenTrue): TypeByBuildFlag[Flag, WhenTrue, WhenFalse] = value.asInstanceOf[TypeByBuildFlag[Flag, WhenTrue, WhenFalse]]
}

