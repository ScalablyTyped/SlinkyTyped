package typingsSlinky.atPulumiAws.atPulumiAwsMod.ec2

import typingsSlinky.atPulumiAws.ec2GetRouteTableMod.GetRouteTableArgs
import typingsSlinky.atPulumiAws.ec2GetRouteTableMod.GetRouteTableResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getRouteTable")
@js.native
object getRouteTable extends js.Object {
  def apply(): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def apply(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def apply(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
}

