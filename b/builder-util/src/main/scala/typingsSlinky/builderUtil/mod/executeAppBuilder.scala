package typingsSlinky.builderUtil.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util", "executeAppBuilder")
@js.native
object executeAppBuilder extends js.Object {
  
  def apply(args: js.Array[String]): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: js.UndefOr[scala.Nothing],
    maxRetries: Double
  ): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: SpawnOptions
  ): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: SpawnOptions,
    maxRetries: Double
  ): js.Promise[String] = js.native
  def apply(args: js.Array[String], childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit]): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: js.UndefOr[scala.Nothing],
    maxRetries: Double
  ): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions
  ): js.Promise[String] = js.native
  def apply(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions,
    maxRetries: Double
  ): js.Promise[String] = js.native
}
