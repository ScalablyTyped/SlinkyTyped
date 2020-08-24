package typingsSlinky.pulumiAws.dynamodbMod

import typingsSlinky.pulumiAws.getTableMod.GetTableArgs
import typingsSlinky.pulumiAws.getTableMod.GetTableResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb", "getTable")
@js.native
object getTable extends js.Object {
  def apply(args: GetTableArgs): js.Promise[GetTableResult] = js.native
  def apply(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] = js.native
}

