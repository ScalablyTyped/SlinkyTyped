package typingsSlinky.pulumiPulumi.rpcMod

import typingsSlinky.pulumiPulumi.resourceMod.Resource
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/rpc", "resolveProperties")
@js.native
object resolveProperties extends js.Object {
  
  def apply(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[js.Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]]
  ): Unit = js.native
  def apply(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[js.Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]],
    err: js.Error
  ): Unit = js.native
}
