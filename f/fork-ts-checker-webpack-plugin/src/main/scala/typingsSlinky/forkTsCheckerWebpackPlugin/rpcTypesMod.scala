package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationTokenData
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.run
import typingsSlinky.forkTsCheckerWebpackPlugin.messageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/RpcTypes", JSImport.Namespace)
@js.native
object rpcTypesMod extends js.Object {
  val RUN: run = js.native
  type RunPayload = CancellationTokenData
  type RunResult = js.UndefOr[Message]
}

