package typingsSlinky.pulumiPulumi.rpcMod

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.resourceMod.Resource
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/rpc", "serializeResourceProperties")
@js.native
object serializeResourceProperties extends js.Object {
  
  def apply(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, _], Map[String, Set[Resource]]]] = js.native
}
