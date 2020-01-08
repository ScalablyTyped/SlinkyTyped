package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.getPrefixListMod.GetPrefixListArgs
import typingsSlinky.atPulumiAws.getPrefixListMod.GetPrefixListResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getPrefixList")
@js.native
object getPrefixList extends js.Object {
  def apply(): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
  def apply(args: GetPrefixListArgs): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
  def apply(args: GetPrefixListArgs, opts: InvokeOptions): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
}

