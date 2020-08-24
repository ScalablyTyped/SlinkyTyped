package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", JSImport.Namespace)
@js.native
object reporterRpcProcedureMod extends js.Object {
  val configure: RpcProcedure[js.Object, Unit] = js.native
  val getIssues: RpcProcedure[FilesChange, js.Array[Issue]] = js.native
}

