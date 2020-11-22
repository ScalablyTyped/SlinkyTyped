package typingsSlinky.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcMod {
  
  type OutputResolvers = typingsSlinky.std.Record[
    java.lang.String, 
    js.Function5[
      /* value */ js.Any, 
      /* isStable */ scala.Boolean, 
      /* isSecret */ scala.Boolean, 
      /* deps */ js.UndefOr[js.Array[typingsSlinky.pulumiPulumi.resourceMod.Resource]], 
      /* err */ js.UndefOr[js.Error], 
      scala.Unit
    ]
  ]
}
