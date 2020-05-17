package typingsSlinky.jestMessageUtil.mod

import typingsSlinky.jestMessageUtil.anon.PickProjectConfigrootDirt
import typingsSlinky.jestTestResult.typesMod.SerializableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatExecError")
@js.native
object formatExecError extends js.Object {
  def apply(
    error: js.UndefOr[js.Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions
  ): String = js.native
  def apply(
    error: js.UndefOr[js.Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: js.UndefOr[js.Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
}

