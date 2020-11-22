package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appsyncResolverMod {
  
  type AppSyncResolverHandler[T, V] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.appsyncResolverMod.AppSyncResolverEvent[T], 
    V | js.Array[V]
  ]
}
