package typingsSlinky.minappEnv

import typingsSlinky.minappEnv.anon.OptionalRecordcompletesuc
import typingsSlinky.minappEnv.minappEnvStrings.complete
import typingsSlinky.minappEnv.minappEnvStrings.fail
import typingsSlinky.minappEnv.minappEnvStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.success]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.fail]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.complete]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[
  T, 
  typingsSlinky.minappEnv.minappEnvStrings.success | typingsSlinky.minappEnv.minappEnvStrings.fail
]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[
  T, 
  typingsSlinky.minappEnv.minappEnvStrings.success | typingsSlinky.minappEnv.minappEnvStrings.complete
]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[
  T, 
  typingsSlinky.minappEnv.minappEnvStrings.fail | typingsSlinky.minappEnv.minappEnvStrings.complete
]])
  - typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
typingsSlinky.minappEnv.Pick[
  T, 
  typingsSlinky.minappEnv.minappEnvStrings.fail | typingsSlinky.minappEnv.minappEnvStrings.complete | typingsSlinky.minappEnv.minappEnvStrings.success
]])
*/
trait OQ[T /* <: OptionalRecordcompletesuc */] extends js.Object

object OQ {
  @scala.inline
  implicit def apply[T](
    value: RQ[T] with (Required[Pick[T, success]]) with (Required[Pick[T, fail]]) with (Required[Pick[T, complete]]) with (Required[Pick[T, success | fail]]) with (Required[Pick[T, success | complete]]) with (Required[Pick[T, fail | complete]]) with (Required[Pick[T, fail | complete | success]])
  ): OQ[T] = value.asInstanceOf[OQ[T]]
}

